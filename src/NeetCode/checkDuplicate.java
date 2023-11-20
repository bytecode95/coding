package NeetCode;

import java.util.Arrays;

public class checkDuplicate {
    public static void main(String[] args) {
        int[] nums1 = {1,2,4,6,1};
        int[] nums2 = {1,4,6};
        int[] nums3 = {-5,-3,-6,-5};
        if(duplicateElements(nums3)){
            System.out.println("Array Contains duplicate elements");
        }else{
            System.out.println("Array does not contain duplicate elements");
        }
    }

    private static boolean duplicateElements(int[] arr) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]==arr[i+1]){
                return true;
            }
        }
        return false;
    }
}
