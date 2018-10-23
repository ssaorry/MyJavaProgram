package utils;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class StringUtils {

    /**
     * 将类转换为Map
     * @param object
     * @return
     */
    public static Map<String,Object> convertObjToMap(Object object) {
        Class clazz = object.getClass();
        Field[] fields = clazz.getDeclaredFields();
        Map<String, Object> resultMap = new HashMap<>();
        try {
            for (Field field : fields) {
                field.setAccessible(true);
                resultMap.put(field.getName().toLowerCase(), field.get(object));
            }
        } catch(Exception e){
            e.printStackTrace();
        }
        return resultMap;
    }

    /**
     * 将Map转化为实体类
     */
    public static <T> T convertMapToObj (Map hashMap, Class<T> clazz){
        try {
            T object = clazz.newInstance();
            Field[] fields = clazz.getDeclaredFields();
            for (Object key : hashMap.keySet()) {
                for (Field field : fields) {
                    if (key.toString().equals(field.getName())) {
                        field.setAccessible(true);
                        field.set(object, hashMap.get(key));
                    }
                }
            }
            return object;
        } catch (Exception e){
            e.printStackTrace();
        }
        return  null;
    }

    /**
     * 判断字符串是否为空或""
     * @param str
     * @return
     */
    public static boolean isEmpty(String str){
        if(str == null || "".equals(str)){
            return true;
        }
        return false;
    }

    /**
     * 判断字符串是否为空或""
     * @param str
     * @return
     */
    public static boolean isNotEmpty(String str){
        return !isEmpty(str);
    }

}
