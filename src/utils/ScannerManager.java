package utils;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.*;

/**
 * 自动扫描包下所有的类，将类的实例封装到map或者list中
 * @Author jingfei
 * @Date 2018-07-03
 */
public class ScannerManager {

    /**
     * 封装获得的所有的类对象，根据key，value存储
     */
    private static Map<String, Object> classMap = new HashMap();

    /**
     * 存储获得的所有类对象,使用List存储
     */
    private static List<Class> classList = new ArrayList<>();

    /**
     * 获取所有的类名
     */
    private static List<String> nameList = new ArrayList<>();

    /**
     * 根据单个包名进行扫描，创建的对象都是单例的
     * @param packageName
     * @return
     */
    public static void getClassName(String packageName){

        if(StringUtils.isNotEmpty(packageName)) {
            /**
             * 获取当前线程的类加载器
             */
            ClassLoader loader = Thread.currentThread().getContextClassLoader();
            /**
             * 将包名中的"."转化为"/"
             */
            packageName = packageName.replace(".", "/");
            /**
             * 获取包名下的所有的文件url
             */
            try {
                Enumeration<URL> urls = loader.getResources(packageName);
                while (urls.hasMoreElements()) {
                    URL url = urls.nextElement();
                    /**
                     * 判断协议的类型是否属于文件
                     */
                    if ("file".equals(url.getProtocol())) {
                        /**
                         *  获取包的物理路径
                         */
                        String filePath = URLDecoder.decode(url.getFile(), "UTF-8");
                        /**
                         * 以文件的方式扫描整个包下的文件 并添加到集合中
                         */
                        addClassesByFile(packageName, filePath, loader);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void getClassName(List<String> list){
        list.forEach((filename) -> getClassName(filename));
    }

    public static void addClassesByFile(String packageName, String filePath, ClassLoader loader){
        File dir = new File(filePath);
        if(!dir.exists() || !dir.isDirectory()) {
            System.out.print("文件不存在或该文件下没有子文件");
        }
        File[] fileList = dir.listFiles();
        for(File file : fileList){
            if(file.isDirectory()){
                addClassesByFile((packageName + File.separator + file.getName()), file.getPath(), loader);
            } else {
                if(file.getName().endsWith(".class")){
                    try {
                        String className = file.getName().substring((0), (file.getName().length()-6));
                        Class<?> clazz = Class.forName((packageName + "." +className));
                        classListAdd(clazz);
                        classMapAdd(className.toLowerCase(),clazz);
                        nameList.add(packageName + "." +className);
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    private static void classListAdd(Class clazz){
        if(classList == null || !classList.contains(clazz)){
            classList.add(clazz);
        }
    }

    public static List<Class> getClassList(){
        return classList;
    }

    public static List<String> getNameList(){
        return nameList;
    }

    public static <T> T getClassByClassName(String className){
        Object object = classMap.get(className.toLowerCase());
        return (T) object;
    }

    private static void classMapAdd(String className, Class clazz){
        Object object = FactoryUtils.newInstance(clazz);
        if(classMap == null ||!classMap.keySet().contains(className)){
            classMap.put(className, object);
        }
    }

    public static Map<String, Object> getClassMap(){
        return classMap;
    }
}
