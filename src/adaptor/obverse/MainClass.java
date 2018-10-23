package adaptor.obverse;

/**
 * 观察者模式
 * 观察同一个对象/主题
 * 随主题做出的动作来改变观察者的动作
 */
public class MainClass {
    public static void main(String[] args) {
        // 自增长
        NumberGenerator numberGenerator = new IncrementalNumberGenerator(10, 50, 5);
        Observer observer1 = new DigitObverser();
        Observer observer2 = new GraphGenerator();
        numberGenerator.addObserver(observer1);
        numberGenerator.addObserver(observer2);
        numberGenerator.excute();

        // 非自增长
        NumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        // lambda表达式
        randomNumberGenerator.addObserver(observer3 -> {
            int number = observer3.getNumber();
            String str = "匿名: ";
            for (int i = 0; i < number; i++) {
                str += ">";
            }
            System.out.println(str);
        });
        randomNumberGenerator.excute();
    }
}