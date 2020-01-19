package com.joseph;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(countAndSay(5));
    }

    public static String countAndSay(int n) {
      String str = "1";


      for(int i = 1; i < n; i++) {
          StringBuilder temp = new StringBuilder();
          int counter = 1;
          char prev = str.charAt(0);

          for(int j = 1; j < str.length(); j++) {
            if(prev == str.charAt(j)) {
                counter ++;
            } else {
                temp.append(counter);
                temp.append(prev);
                counter = 1;
                prev = str.charAt(j);

            }
          }

          temp.append(counter);
          temp.append(prev);

          str = temp.toString();


      }

        return str;

    }
}
