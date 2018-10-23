package proxy;

import reflect.Person;
import reflect.PersonHandle;
import reflect.Transaction;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class ProxyTest {
    public static void main(String[] args){
        Person person = new Student("张三");
        InvocationHandler studentHandle = new PersonHandle<>(person);
        Person proxy = (Person) Proxy.newProxyInstance(Person.class.getClassLoader(),new Class<?>[]{Person.class}, studentHandle);
        person.giveMoney();
        proxy.giveMoney();

        String packageName = "proxy";
        AopClass aop = new AopClass(packageName, Transaction.class);
        Person teacher = (Person) ScannerAnnotation.getClassTypeByName("Teacher");
        teacher.giveMoney();
    }
}
