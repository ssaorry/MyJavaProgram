package adaptor.callback;

public class Tom implements CallBack{
    @Override
    public void sendMessage() {
        System.out.println("我是Tom, 我要吃饭了" );
    }
}
