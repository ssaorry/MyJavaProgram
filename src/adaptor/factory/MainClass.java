package adaptor.factory;

/**
 * 将实例的生成交给子类来实现
 */
public class MainClass {
    public static void main(String[] args){
        Factory factory = new IDCardFactory();
        IDCard idCard = (IDCard) factory.create("荆飞");
        idCard.use();
    }
}
