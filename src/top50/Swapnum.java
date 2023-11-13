package top50;

public class Swapnum {
    public static void main(String[] args) {
        int a = 10;
        int b = 8;
        System.out.printf("before Swapping: a = %d & b = %d", a,b);
        System.out.println(" ");
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.printf("after Swapping: a = %d & b = %d", a,b);
        System.out.println(" ");

        int x = -3;
        int y = 5;

        x = x+y;
        y = x-y;
        x = x-y;
        System.out.printf("after Swapping: x = %d & y = %d", x,y);

    }
}
