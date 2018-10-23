package utils;

public class FactoryUtils {

    public static <T> T newInstance(Class<T> clazz){
        try{
            if(clazz != null) {
                return clazz.newInstance();
            }
        } catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
