package adaptor.listener;

public class Student {
    private Listener myListener;

    public void setMyListener(Listener listener){
        this.myListener = listener;
    }

    public void isReading(){
        Event event = new Event();
        event.setStudent(this);
        myListener.isReading(event);

        System.out.println("开始读书");
    }
}
