package top50;

import java.util.Collections;
import java.util.LinkedList;

public class Reverselinkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(2);
        list.add(5);
        list.add(0);
        list.add(-3);
        list.add(10);
        list.add(15);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
    }
}
