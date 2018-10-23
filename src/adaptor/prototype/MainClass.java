package adaptor.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * 根据对象生成实例
 * 先注册，后根据类名获取新建的对象
 */
public class MainClass {
    public static void main(String[] args){
        Product product1 = new AboveLineProduct();
        Product product2 = new UnderLineProduct();
        Manager.register(product1);
        Manager.register(product2);

        // 好处是将类信息全部隐藏起来,增强安全性,在客户端看不到实际用到的类到底是哪个
        Product cloneProduct1 = Manager.create("aboveLineProduct");
        Product cloneProduct2 = Manager.create("underLineProduct");
        cloneProduct1.use("jingfei");
        cloneProduct2.use("jingfei");

        List<String> list = new ArrayList<>();
        list.add("2018-08-18");
        list.add("2018-08-18");
        list.add("2018-08-18");
        list.add("2018-08-18");
        System.out.print(list.toString());
    }
}
