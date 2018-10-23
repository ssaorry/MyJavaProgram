package adaptor.builder;

import java.util.concurrent.ConcurrentHashMap;

public class BuilderContainer {

    public static ConcurrentHashMap<Integer, Builder> containMap = new ConcurrentHashMap();

    public static void put(Integer eventId, Builder builder){
        containMap.put(eventId, builder);
    }

    public static Builder get(Integer eventId){
        return containMap.get(eventId);
    }
}
