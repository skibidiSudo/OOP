package hus.oop.lab8.excerciseonlists;

import java.util.*;

public class Lists {

    public static void insertFirst(List<Integer> list, int value) {
        list.add(0, value);
        // TODO
    }

    public static void insertLast(List<Integer> list, int value) {
        list.add(value);
        // TODO
    }

    public static void replaceThird(List<Integer> list, int value) {
        list.set(2, value);
        // TODO
    }

    public static void removeThird(List<Integer> list) {
        if (list.size() > 3) {
            list.remove(2);
        } else {
            System.out.println("No third value exists.");
        }
        // TODO
    }

    public static void removeEvil(List<Integer> list) {
        if (contains(list, 666)) {
            list.remove(Integer.valueOf(666));
        } else {
            System.out.println("No Evil exists.");
        }
        // TODO
    }

    public static List<Integer> generateSquare() {
        List<Integer> ans = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            ans.add(i * i);
        }
        // TODO
        return ans;
    }

    public static boolean contains(List<Integer> list, int value) {
        // TODO
        return list.contains(value);
    }

    public static void copy(List<Integer> source, List<Integer> target) {
        Iterator<Integer> iterator = source.iterator();
        while (iterator.hasNext()) {
            Integer num = iterator.next();
            target.add(num);
        }
    }

    public static void reverse(List<Integer> list) {
        Collections.reverse(list);
        // TODO
    }

    public static void reverseManual(List<Integer> list) {
        int l = 0, r = list.size() - 1;
        while (l <= r) {
            int value = list.get(l);
            list.set(l, list.get(r));
            list.set(r, value);
            l++;
            r--;
        }
        // TODO
    }

    public static void insertBeginningEnd(LinkedList<Integer> list, int value) {
        insertFirst(list, value);
        insertLast(list, value);
        // TODO
    }
}