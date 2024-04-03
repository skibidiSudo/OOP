package hus.oop.lab8.exerciseonmaps;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class Maps {
    public static int count(Map<Integer, Integer> map) {
        return map.size();
    }
    public static void empty(Map<Integer, Integer> map) {
        map.clear();
    }
    public static boolean contains(Map<Integer, Integer> map, int key) {
        return map.containsKey(key);
    }

    public static boolean containsKeyValue(Map<Integer, Integer> map, int key, int value) {
        if (contains(map, key)){
            Integer val = map.get(key);
            return val == value;
        }
        return false;
    }
    public static Set<Integer> keySet(Map<Integer, Integer> map) {
        return map.keySet();
    }

    public static Collection<Integer> values(Map<Integer, Integer> map) {
        return map.values();
    }

    public static String getColor(int value) {
        switch (value) {
            case 0:
                return "black";
            case 1:
                return "white";
            case 2:
                return "red";
        }
        return "color does not exist";
    }
}

