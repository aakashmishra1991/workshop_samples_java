package core.collections;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MapMain {

    public static void main(String[] args) {
        final Map<String, String> map = new ConcurrentHashMap<>();
        map.put("name1", "a1");
        map.put("name2", "a2");
        map.put("name3", "a3");
        map.put("name4", "a4");
        map.forEach((key, value) -> System.out.println(key+"-"+value));
    }
}
