package designpacakge;

public class Pattern4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            if(i<=5){
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }else{
                for (int j = 1; j <= i-j ; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }


        }
    }
}
