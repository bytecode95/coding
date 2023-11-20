package NeetCode;

import java.util.Arrays;
import java.util.Scanner;

public class checkAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String value1: ");
        String str1 = sc.next();
        System.out.print("Enter String value2: ");
        String str2 = sc.next();
        if (anagramChecker(str1, str2)) {
            System.out.println("Both String are Anagrams");
        }else{
            System.out.println("Both String are not Anagrams");
        }
    }

    private static boolean anagramChecker(String str1, String str2) {
        str1 = str1.replaceAll("\\s","").toLowerCase();
        str2 = str2.replaceAll("\\s","").toLowerCase();
        if(str1.length()==str2.length()){
            int[] freq1 = new int[26];
            int[] freq2 = new int[26];
            for(int i=0; i<str1.length();i++){
                freq1[i] = str1.charAt(i);
                freq2[i] = str2.charAt(i);
            }
            if(Arrays.equals(freq1, freq2)){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }
}
