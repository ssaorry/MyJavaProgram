package proxy;

import reflect.Person;
import reflect.Transaction;

@Transaction
public class Teacher implements Person {

    private String name;
    @Override
    public void giveMoney() {
        System.out.println("Teacher收到班费");
    }
}
