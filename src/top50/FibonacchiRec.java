package top50;

import java.util.Scanner;



public class FibonacchiRec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of times: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacchiRec(i)+" ");
        }

    }

    public static int fibonacchiRec(int n) {
        if(n<=1){
            return n;
        }
        return fibonacchiRec(n-1)+ fibonacchiRec(n-2);
    }

}
