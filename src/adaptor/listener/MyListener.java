package adaptor.listener;

public class MyListener implements Listener {
    @Override
    public void isReading(Event event) {
        Student student = event.getStudent();
        System.out.println(student.toString());
    }
}
