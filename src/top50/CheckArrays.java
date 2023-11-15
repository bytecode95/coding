package top50;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class CheckArrays {
    public static void main(String[] args) {
        int[] num1 = {1,2,3,5,6,7};
        int[] num2 = {1,2,3,3,5,6,6,7};
        int[] num3 = {-2,1,2,3,5,6,7};
        int[] num4 = {-5,1,2,8,9};

        if (checkArrays(num1, num2)){
            System.out.println("Both arrays having same element");
        }else{
            System.out.println("Both arrays dont having same element");
        }
    }

    private static boolean checkArrays(int[] arr1, int[] arr2) {
        Set<Object> set1 = new HashSet<>(Collections.singletonList(arr1));
        Set<Object> set2 = new HashSet<>(Collections.singletonList(arr2));



        if(set1.size()!=set2.size()){
            return false;
        }
        for (Object item: set1) {
            if(!set2.contains(item)){
                return false;
            }
        }
        return true;

    }
}
