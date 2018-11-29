package adaptor.callback;

import adaptor.iterator.Iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

public class Mother {

    private List<CallBack> callBackList = new ArrayList<>();

    public void advise(CallBack callBack){
        callBackList.add(callBack);
    }

    public void tell(){
        List<CallBack> callBackList = getCallBackClass(CallBack.class);
        System.out.println("通知儿子们吃饭。。。。。。。");
        for(CallBack callBack : callBackList){
            callBack.sendMessage();
        }
    }

    private <T> List<T> getCallBackClass(Class clazz) {
        List<T> callBackList = new ArrayList<>();
        try {
            ServiceLoader<Class<?>> loader = ServiceLoader.load(clazz);
            java.util.Iterator<Class<?>> iterator = loader.iterator();
            while(iterator.hasNext()){
                Class<?> callBack = iterator.next();
                T t = (T) callBack.newInstance();
                callBackList.add(t);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return callBackList;
    }

}
