package top50;

import java.util.Arrays;

public class DemoArrays {
    public static void main(String[] args) {
        int[] nums = {2,2,3,5};
        int[] answer = new int[nums.length];
        int total=1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length ; j++) {
                total *= nums[j];
            }
            answer[i] = total;
            total=1;
        }
        System.out.println(Arrays.toString(answer));

    }
}
