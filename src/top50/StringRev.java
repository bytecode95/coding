package top50;

import java.util.Arrays;
import java.util.Scanner;

public class StringRev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.next();

        System.out.println(stringRev(str));



    }



    private static String stringRev(String str) {
        StringBuilder builder = new StringBuilder();
        for (int i = str.length()-1; i >= 0; i--) {
            builder.append(str.charAt(i));

        }
        return builder.toString();

    }


    //this method is not memory optimized. because when string concatenation always create a new string in string pool. memory wastage is high.
    private static String revString(String str) {
        String rev = "";
        for (int i = str.length()-1; i >= 0 ; i--) {
            rev += str.charAt(i);
        }
        return  rev;
    }
}
