package com.joseph;

import java.util.HashMap;
import java.util.Map;

public class Main {

    // You can't use a primitive because HashMap use object internally for the key
    // Use Integer instead.
    // Java will automatically autobox your int primitive values to Integer objects.
    // you can't put an int (or other primitive value) into a collection.
    // Collections can only hold object references, so you have to box primitive values into the appropriate wrapper class



    public static void main(String[] args) {
	// write your code here
        romanToInt("MCMXCIV");
    }

    public static int romanToInt(String s) {
        // create map to store key and value pairs
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;

       for(int i = 0; i < s.length(); i++) {
           if(i > 0 && map.get(s.charAt(i)) > map.get(s.charAt(i - 1))) {
               // undo the adding of the previous value
               result -= map.get(s.charAt(i - 1));
               // add the new number
               result += map.get(s.charAt(i)) - map.get(s.charAt(i - 1));
           } else {
               result += map.get(s.charAt(i));
           }
       }


       return result;

    }
}
