package top50;

public class Checkodd {
    public static void main(String[] args) {
        int[] arr = {2,4,7,3,8,9,12,15,17,23};
        for (int value:arr) {
            if(value%2!=0){
                System.out.println(value);
            }

        }
    }
}
