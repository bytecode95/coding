package top50;

import java.util.Arrays;

public class Checkelement {
    public static void main(String[] args) {
        int[] num1 = {1,4,7,3,9,12};
        int[] num2 = {1,4,7,3,5,2};
        int[] num3 = {1,4,7,3,9,12};

        System.out.println(Arrays.equals(num1, num3));

        if(checkElements(num1, num3)){
            System.out.println("Both arrays having same elements");
        }else{
            System.out.println("Arrays dont have any common element");
        }
    }

    private static boolean checkElements(int[] arr1, int[] arr2) {
        if(arr1.length==arr2.length){
            //compare elements
            for (int i = 0; i < arr1.length; i++) {

                if(arr1[i]!=arr2[i]){
                    return false;
                }

            }
        }else{
            return false;
        }
        return true;

    }
}
