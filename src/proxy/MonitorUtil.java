package proxy;

import java.util.Date;

public class MonitorUtil {

    public static void start(){
        try {
            Thread.sleep(1000);
            System.out.println("开始计时：" + new Date());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void finish(){
        System.out.println("计时结束：" + new Date());
    }
}
