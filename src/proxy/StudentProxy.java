package proxy;

import reflect.Person;

public class StudentProxy {

    // 被代理对象
    private Student student;

    public StudentProxy(Student student){
        this.student = student;
    }

    public StudentProxy(){

    }

    public void giveMoneyBefore() {
        System.out.println("班长代收班费开始......");
    }

    public void giveMoneyAfter() {
        System.out.println("班长代收班费结束");
    }
}
