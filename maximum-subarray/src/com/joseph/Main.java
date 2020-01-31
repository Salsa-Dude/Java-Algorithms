package com.joseph;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }


    // CubicTimeSolution

    public static int maxSubArray(int[] nums) {

        int maxValue = Integer.MIN_VALUE;

        /*
             We will use these outer 2 for loops to investigate all
            windows of the array.

            We plant at each 'left' value and explore every
            'right' value from that 'left' planting.
            These are our bounds for the window we will investigate.
        */

        for(int left = 0; left < nums.length; left++) {
            System.out.println("****************************************************");
            for(int right = left; right < nums.length; right++) {
                System.out.println("-----------------");
                /*
                    Let's investigate this window
                */
                int currentSum = 0;
                for(int k = left; k <= right; k++) {
                    System.out.println(nums[k]);
                    currentSum += nums[k];
                }

                maxValue = Math.max(maxValue, currentSum);

            }
        }

      return maxValue;
    }


}
