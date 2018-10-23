package reflect;

import design.Apple;
import utils.ScannerManager;
import utils.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Test {

    public static void main(String[] args){
        /*Apple apple = FactoryUtils.newInstance(Apple.class);
        apple.setName("苹果");
        apple.setColor("红色");
        System.out.println(apple);

        Map<String, Object> map = StringUtils.convertObjToMap(apple);
        System.out.println(map);*/
        List<String> list = new ArrayList<>();
        list.add("utils");
        list.add("design");
        ScannerManager.getClassName(list);
        Map<String, Object> classMap = ScannerManager.getClassMap();
        List<Class> classList = ScannerManager.getClassList();
        Apple apple = ScannerManager.getClassByClassName("apple");
        apple.setName("苹果");
        apple.setColor("红色");
        System.out.println(apple);
        System.out.println(StringUtils.convertObjToMap(apple));
        StringUtils apple1 = ScannerManager.getClassByClassName("stringutils");
        StringUtils apple2 = ScannerManager.getClassByClassName("stringutils");
        System.out.println(apple1);
        System.out.println(apple2);
        System.out.println(classMap);
        System.out.println(classList);

    }
}
