package top50;

import java.util.Scanner;

public class Stringimmutable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.next();

        System.out.println(str.concat(" class"));
        System.out.println(str);
        System.out.println();
        String s1 = "Java";
        String s2 = "Java";
        System.out.println(s1==s2);
        s1 = "python";
        //checking whether s2 also changed with s1 changes
        System.out.println(s1==s2);

    }
}
