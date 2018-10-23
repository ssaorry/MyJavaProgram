package utils;

import design.Apple;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

public class MainClass {
    public static void main(String[] args){
        Apple apple = new Apple();
        apple.setColor("red");
        apple.setName("苹果");
        Map appleMap = StringUtils.convertObjToMap(apple);
        System.out.println(appleMap);

        Apple apple1 = StringUtils.convertMapToObj(appleMap, Apple.class);
        System.out.println(apple1);


        long nowDateTime = System.currentTimeMillis() + 1000;
        Date nowDate = new Date(nowDateTime);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(simpleDateFormat.format(new Date()));
        System.out.println(simpleDateFormat.format(nowDate));
    }
}