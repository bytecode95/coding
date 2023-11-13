package top50;

import java.util.Scanner;

public class checkVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.next();
        str = str.toLowerCase();
       if(checkVowel(str)){
           System.out.println("At least one Vowel present in String");
       }else{
           System.out.println("vowels are not present in string");
       }


    }
    public static boolean checkVowel(String str){

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch=='a' || ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'){
                return true;
            }
        }
        return false;
    }
}
