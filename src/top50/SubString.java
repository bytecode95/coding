package top50;

import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.next();
        subString(str);
    }

    private static void subString(String str) {
        String newString = null;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <= str.length(); j++) {
                newString = str.substring(i,j);
            }
            System.out.println(newString);
        }
    }
}
