package top50;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        factorial(num);
    }

    public static void factorial(int n){
        int ans = 1;
        if(n<2){
            System.out.println(1);
        }else{
            for (int i = 1; i <= n; i++) {
                ans *= i;
            }
            System.out.println(ans);
        }
    }
}
