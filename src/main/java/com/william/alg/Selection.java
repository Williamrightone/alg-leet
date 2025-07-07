package com.william.alg;

import java.util.Arrays;
import java.util.Collection;

/**
 * 將範圍內將最小值找到, 丟到最前面, 然後縮小範圍
 */
public class Selection {

    public static void main (String[] args){

        int[] arr = {5, 3, 8, 4, 2};

        for(int i =0; i< arr.length; i++){

            int minIndex = i;

            for(int j = i + 1; j < arr.length; j++){

                if(arr[minIndex] > arr[j]){
                    minIndex = j;
                }

                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;

            }
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }

    }

}
