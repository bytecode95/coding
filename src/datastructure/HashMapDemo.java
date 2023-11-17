package datastructure;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> m = new HashMap<>();
        m.put(100, "chethana");
        m.put(101, "lahiru");
        m.put(102, "nipuna");
        m.put(103, "chethana");
        m.put(104, "kasun");
        m.put(105, "sithmi");
        //key will not be duplicated and value will be replaced
        //m.put(103, "sithmi");
        System.out.println(m);

        System.out.println(m.get(104));
        //remove
        m.remove(102);
        System.out.println(m);

        m.put(106, null);
        System.out.println(m);

        System.out.println(m.containsKey(110));
        System.out.println(m.containsValue(null));
        System.out.println(m.isEmpty());
        System.out.println(m.keySet());
        for (int value: m.keySet()) {
            System.out.println(value);
        }

        System.out.println(m.values());
        for (String str: m.values()) {
            System.out.println(str);
        }

        System.out.println(m.size());
        m.replace(101,"lahiru", "menuaka");
        System.out.println(m);

        m.put(null, "lahiru");
        System.out.println(m);

        System.out.println(m.entrySet());





        m.clear();
        System.out.println(m);



    }
}
