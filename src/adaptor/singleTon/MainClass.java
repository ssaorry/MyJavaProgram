package adaptor.singleTon;

public class MainClass {
    public static void main(String[] args){
        Thread thread1 = new Thread(new Runnable() {
            SingleTonClass singleTonClass1 = SingleTonClass.getInstance();
            @Override
            public void run() {
                for(int i=0; i<10; i++){
                    System.out.println("线程1：" + singleTonClass1.getNextIndex());
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            SingleTonClass singleTonClass2 = SingleTonClass.getInstance();
            @Override
            public void run() {
                for(int i=0; i<10; i++){
                    System.out.println("线程2：" + singleTonClass2.getNextIndex());
                }
            }
        });
        thread1.start();
        thread2.start();
    }
}
