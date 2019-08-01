package com.tutal;

public class Main {

    public static void main(String[] args) {

        int arr1[] = {1, 2, 3, 4, 5, 6};
        int arr2[] = {5, 6, 7, 8, 9, 10, 11, 66, 78};
        int result[] = new int[arr1.length + arr2.length];
        int k = 0, i=0, j=0;

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

        for (i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

    }

    public static int[] mergeArrays(int[] arr1, int[] arr2){
        return new int[10];
    }


}
