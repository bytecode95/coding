package top50;

import java.util.Scanner;

public class Fibonacchi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        fibonacchi(n);


    }
    //this is not the recursive method
    private static void fibonacchi(int n) {
        int a3;
        int a1 = 0;
        int a2 = 1;
        System.out.print(0+" , "+1);

        for(int i=0; i<n; i++){
            a3 = a1 + a2;
            System.out.print(" , "+a3);
            a1 = a2;
            a2 = a3;
        }
    }



}
