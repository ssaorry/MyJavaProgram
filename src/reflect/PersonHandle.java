package reflect;

import proxy.MonitorUtil;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class PersonHandle<T> implements InvocationHandler {

    T target;

    public PersonHandle(T target){
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        MonitorUtil.start();
        Object result = method.invoke(target,args);
        MonitorUtil.finish();
        return result;
    }
}
