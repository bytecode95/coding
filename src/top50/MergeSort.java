package top50;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = { 70, 50, 30, 10, 20, 40, 60 };

        System.out.println(Arrays.toString(mergeSorting(arr)));
    }

    //mergeSorting is a Recursive algorithm--always divided into two arrays and sort it as a two way sorting
    public static int[] mergeSorting(int[] arr) {
        if(arr.length==1){
            return arr;
        }
        int start = 0;
        int middle = arr.length/2;
        int end = arr.length;
        int[] left = mergeSorting(Arrays.copyOfRange(arr, start, middle));
        int[] right = mergeSorting(Arrays.copyOfRange(arr, middle, end));

        return merge(left, right);
    }
    //two way sorting
    public static int[] merge(int[] left, int[] right) {
        int a = left.length;
        int b = right.length;
        int i =0;
        int j = 0;
        int k= 0;
        int[] newArr = new int[a+b];
        while(i <a && j < b){
            if(left[i]<=right[j]){
                newArr[k] = left[i];
                i++;
            }else{

                newArr[k] = right[j];
                j++;
            }
            k++;
        }

        while(i < a){
            newArr[k] = left[i];
            i++;
            k++;

        }

        while(j < b){
            newArr[k] = right[j];
            j++;
            k++;

        }

        return newArr;
    }


}
