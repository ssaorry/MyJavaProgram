package thread;

public class MainClass {
    public static void main(String[] args) {

        long begin = System.currentTimeMillis();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }
        });
        thread1.run();

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }
        });
        thread2.run();

        // lambda 表达式
        new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }
        }).run();

        long end = System.currentTimeMillis();
        System.out.println("执行时间：" + (end - begin));
    }
}
