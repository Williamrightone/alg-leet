package com.william.alg;

/**
 * 每一輪結束後，最大值一定會「冒」到最尾端
 */
public class Bubble {

    public static void main (String[] args) {
        int[] arr = {5, 3, 8, 4, 2};

        for (int num : arr) {
            System.out.print(num + " ");
        }

        for(int i =0; i< arr.length -1; i ++){

            for(int j = 0; j < arr.length -1 -i; j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println(" ");

        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println(" ");
        System.out.println("Reverse: ");

        for(int i =0; i< arr.length -1; i ++){

            for(int j = 0; j < arr.length -1 -i; j++){
                if(arr[j] < arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }

    }


}
