package collection;

import classes.Employee;

import java.util.*;

public class CollectionFrameworkDemo {

    public static void main(String[] args) {
        Integer[] i = new Integer[100];
        i = new Integer[10];
        System.out.println(i[0]);
//        10001 - 0index , 1 -> 10002, 2 -> 10003,
        ArrayList arrayList = new ArrayList<>();
        arrayList.add(123);
        arrayList.add(123);
        arrayList.add(123);
        arrayList.add(78);
        System.out.println(arrayList.get(0));
//        System.out.println(arrayList.get(10));
        System.out.println(arrayList.contains(78));
        arrayList.lastIndexOf(123);
//        Integer[] integers = (Integer[]) arrayList.toArray();
        arrayList.remove(1);

        List<Integer> list = new ArrayList<>();
//        list.add("abc");
        list.add(new Integer(123));
//        list.add(new Float(123.44));
//        list.add(new Employee());

        for (int j = 0; j < list.size(); j++) {
            System.out.println((list.get(j)) * 2);
        }
    }
}
