package datastructure;

public class HashMapDemo2 {
    public static void main(String[] args) {
        int a =10;
        System.out.println(Integer.hashCode(a));
        int b = -12;
        System.out.println(Integer.hashCode(b));
        String str = "chethana";
        String str1 = "chethana";
        System.out.println(str.hashCode());
        System.out.println(str1.hashCode());

        char ch = 'a';
        System.out.println(Character.hashCode(ch));
    }
}
