import java.util.*;

public class Main {

    public static void main(String[] args) {
        isValid("([)]");
    }

    public static boolean isValid(String s) {
        Map<String, String> map = new HashMap<>();
        ArrayList<String> stack = new ArrayList<>();

        // convert String to array
        String[] arr = s.split("");
        // Using the method asList to convert from array to ordered list
        List<String> strArray = Arrays.asList(arr);

        map.put("(", ")");
        map.put("[", "]");
        map.put("{", "}");

        // iterate thru strArray
        // if str is a key in map which indicate str is a opening bracket, add it to stack
        for(String str : strArray) {
            if(map.get(str) != null) {
                stack.add(str);
            } else {
                // grab last element in stack and check to see if current str matches the value of last element
                String lastOpenBracket = stack.get(stack.size() - 1);
                stack.remove(stack.size() - 1);
                if(map.get(lastOpenBracket).equals(str) == false) {
                    return false;
                }
            }
        }

        if(stack.size() > 0) {
            return false;
        }

        return true;


    }
}
