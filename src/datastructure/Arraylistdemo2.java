package datastructure;

import java.util.ArrayList;

public class Arraylistdemo2 {
    public static void main(String[] args) {
        //generics
        ArrayList<Object> list = new ArrayList<>();
        list.add("chethana");
        list.add(2);
        list.add('a');
        list.add(true);
        list.add(null);
        System.out.println(list);

        //generic list
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("chethana");
        list1.add("namal");
        list1.add("kamal");
        System.out.println(list1);
    }
}
