package com.william.top150.multidimensional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Triangle {

    public static void main(String[] args) {

        List<List<Integer>> triangle = new ArrayList<>();

        triangle.add(Arrays.asList(2));
        triangle.add(Arrays.asList(3, 4));
        triangle.add(Arrays.asList(6, 5, 7));
        triangle.add(Arrays.asList(4, 1, 8, 3));

        System.out.println(minimumTotal(triangle));
        System.out.println(minimumTotal2(triangle));
    }

    /**
     * Greedy method
     * @param triangle
     * @return
     */
    public static int minimumTotal(List<List<Integer>> triangle) {

        int initStep =0;

        int total = triangle.get(0).get(initStep);

        for(int i = 1; i< triangle.size(); i++){

            if( triangle.get(i).get(initStep) >= triangle.get(i).get(initStep+1)){

                    // 把 total 加上去
                    total = total + triangle.get(i).get(initStep+1);

                    //原來的點 +1
                    initStep = initStep + 1;

            } else if (triangle.get(i).get(initStep) <= triangle.get(i).get(initStep+1)){

                    total = total + triangle.get(i).get(initStep);

            }

        }

        return total;
    }

    public static int minimumTotal2(List<List<Integer>> triangle) {

        int n = triangle.size();

        List<Integer> dp = new ArrayList<>(triangle.get(n-1));

        for(int i = n-2; i >= 0 ; i-- ){

            for(int j = 0; j<=i; j++ ){

                dp.set(j, triangle.get(i).get(j) + Math.min(dp.get(j), dp.get(j+1)));
            }

        }

        return dp.get(0);
    }

}
