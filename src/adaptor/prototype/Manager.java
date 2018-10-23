package adaptor.prototype;

import java.util.HashMap;
import java.util.Map;

public class Manager {

    private static Map showcase = new HashMap();

    static {
        /**
         * 扫描所有有某个注解的类 classList
         * for(Class clazz : ClassList){
         *      Object object = clazz.newInstance();
         *      register(object);
         * }
         */
        //register(null);
    }

    public static void register(Product product){
        String className = product.getClass().getSimpleName();
        className = className.substring(0,1).toLowerCase() + className.substring(1,className.length());
        showcase.put(className, product);
    }

    public static Product create(String className){
        Object object = showcase.get(className);
        if(object != null){
            return ((Product) object).createClone();
        }
        return null;
    }
}
