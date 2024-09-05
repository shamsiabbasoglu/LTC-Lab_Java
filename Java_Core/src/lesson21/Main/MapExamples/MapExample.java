package lesson21.Main.MapExamples;

import java.util.Map;
import java.util.TreeMap;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> mapPhoneCodes = new TreeMap<>();
        mapPhoneCodes.put(1, "USA");
        mapPhoneCodes.put(7, "Russia");
        mapPhoneCodes.put(90, "Türkiye");
        mapPhoneCodes.put(993, "Georgia");
        mapPhoneCodes.put(994, "Azerbaijan");
        mapPhoneCodes.put(995, "Armenia");
        System.out.println(mapPhoneCodes);

        System.out.println(mapPhoneCodes.get(994));

        mapPhoneCodes.remove(995);
        System.out.println(mapPhoneCodes);
    }
}
