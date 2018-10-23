package proxy;

import reflect.Person;
import reflect.Transaction;

@Transaction
public class Student implements Person {

    private String name;

    public Student(String name){
        this.name = name;
    }

    public Student(){

    }

    @Override
    public void giveMoney() {
        System.out.println(name + "上缴班费50元");
    }
}
