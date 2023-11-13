package top50;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        if(checkPrime(num)){
            System.out.println("Number is a prime number");
        }else{
            System.out.println("Number is not a prime number");
        }
    }

    private static boolean checkPrime(int num) {
        if(num<2){
            return false;
        }else if(num==2){
            return true;
        }else{
            for (int i = 2; i < num; i++) {
                if(num%i == 0){
                    return false;
                }

            }
        }
        return true;
    }
}
