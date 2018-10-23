package adaptor.adaptor.classAdaptor;

/**
 * 适配器模式
 * 1. 类适配器
 *    某个类想实现另外一个接口中的方法，而又不能继承该接口，这时候可以新建一个类，然后继承该类并继承要实现的接口，通过适配类实现方法
 * 2. 对象适配器
 *    使用代理而不是继承使用被适配类
 * 3. 接口适配器
 *    一个接口有很多的方法，而我们只需要实现其中的几种，这时候我们可以先用一个抽象类继承接口，然后再继承抽象类，达到只实现自己想要实现的方法的目的
 */

public class MainClass {
    public static void main(String[] args){
        Ps2 ps2 = new Adaptor();
        ps2.isPs2();
    }
}
