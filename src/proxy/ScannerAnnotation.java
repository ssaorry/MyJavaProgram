package proxy;

import reflect.Transaction;
import utils.ObjectHandle;
import utils.ScannerManager;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ScannerAnnotation {

    private static List<String> nameList;
    private static List<Class> annotationClassList = new ArrayList<>();
    private static Map<String, Class> classMap = new HashMap<>();

    // 扫描包下面所有的类并获取被注解标记的类
    public static List<Class> initScannerAnnotation(String path, Class annotation){
        ScannerManager.getClassName(path);
        nameList = ScannerManager.getNameList();

        for(String name : nameList){
            try {
                Class clazz = Class.forName(name);
                Annotation annotations = clazz.getAnnotation(Transaction.class);
                if (annotations != null) {
                    annotationClassList.add(clazz);
                    classMap.put(clazz.getSimpleName(), clazz);
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return annotationClassList;
    }

    public static Map<String, Class> getClassMap(){
        return classMap;
    }

    public static <T> T getClassTypeByName(String name){
        System.out.print("代理开始");
        Class clazz = classMap.get(name);
        T object;
        try {
            object = (T) Class.forName(clazz.getTypeName()).newInstance();
            Class<?>[] clazzs = object.getClass().getInterfaces();
            InvocationHandler objectHandle = new ObjectHandle(object);
            T proxy = (T) Proxy.newProxyInstance(object.getClass().getClassLoader(), clazzs, objectHandle);
            return proxy;
        } catch (Exception e) {
            e.printStackTrace();
        }
       return null;
    }
}
