package datastructure;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Hashsetdemo {
    public static void main(String[] args) {
        HashSet<Object> hs = new HashSet<>();


        //intiial size of hasset - 16
        //load factor(fill ratio) - 0.75 default value
        hs.add(3);
        hs.add("chethana");
        hs.add(15.50);
        hs.add(null);
        hs.add(true);
        hs.add('a');
        System.out.println(hs);

        hs.remove(15.50);
        System.out.println(hs);
        //read elements of hashset
        for (Object value:hs) {
            System.out.println(value);
        }

        System.out.println("--------------------");
        System.out.println(hs.contains("chethana"));
        System.out.println(hs.contains("Chethana"));
        System.out.println("--------------------");
        System.out.println(hs.isEmpty());


        HashSet<Integer> hs1 = new HashSet<>();
        hs1.add(2);
        hs1.add(6);
        hs1.add(12);
        hs1.add(10);
        System.out.println(hs1);

        HashSet<Integer> hs2 = new HashSet<>(hs1);
        //System.out.println(hs2);
        hs2.add(20);
        System.out.println(hs2);

        hs2.removeAll(hs1);
        System.out.println(hs2);

        System.out.println();

        //opertions

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        System.out.println(set1);

        set2.add(3);
        set2.add(4);
        set2.add(6);
        System.out.println(set2);

        //union - sum all elements show unique elements
//        set1.addAll(set2);
//        System.out.println(set1);

        //intersection - common elements
//        set1.retainAll(set2);
//        System.out.println(set1);

        //difference -
//        set1.removeAll(set2);
//        System.out.println(set1);

        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        set.add(100);
        set.add(200);
        set.add(300);
        set.add(400);
        set.add(500);
        System.out.println(set);




    }
}
