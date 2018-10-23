package utils;

import proxy.StudentProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ObjectHandle implements InvocationHandler {

    private Object proxy;
    private StudentProxy studentProxy = new StudentProxy();

    public ObjectHandle(Object proxy,StudentProxy studentProxy){
        this.proxy = proxy;
        this.studentProxy = studentProxy;
    }

    public ObjectHandle(Object proxy){
        this.proxy = proxy;
    }

    @Override
    public Object invoke(Object target, Method method, Object[] args) throws Throwable {
        studentProxy.giveMoneyBefore();
        Object result = method.invoke(proxy, args);
        studentProxy.giveMoneyAfter();
        return result;
    }
}
