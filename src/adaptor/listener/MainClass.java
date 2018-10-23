package adaptor.listener;

public class MainClass {
    public static void main(String[] args){
        Student student = new Student();
        Listener listener = new MyListener();
        student.setMyListener(listener);
        student.isReading();
    }
}
