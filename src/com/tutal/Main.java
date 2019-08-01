package com.tutal;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int arr1[] = {1, 2, 3, 4, 5, 6};
        int arr2[] = {5, 6, 7, 8, 9, 10, 11, 66, 78};






            System.out.println(Arrays.toString(mergeArrays(arr1, arr2)));


    }

    public static int[] mergeArrays(int[] arr1, int[] arr2){
        int k = 0, i=0, j=0;
        int result[] = new int[arr1.length + arr2.length];
        while (i < arr1.length ||
                j < arr2.length) {

            if(i==arr1.length){
                result[k] = arr2[j];
                j++;
                k++;
                continue;
            }
            else if(j==arr2.length){
                result[k] = arr1[i];
                i++;
                k++;
                continue;
            }

            if (arr1[i] <= arr2[j]) {
                result[k] = arr1[i];
                i++;
            }
            else {
                result[k] = arr2[j];
                j++;
            }
            k++;
        }
        return result;
    }


}
