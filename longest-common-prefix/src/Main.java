public class Main {

    public static void main(String[] args) {
        String[] strs = {"aa", "aab", "aabb"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        /* strs is empty */
        if (strs.length == 0) {
            return "";
        }

        String smallestWord = "";

        // find the smallest word in array
        for(String word : strs) {
            if(smallestWord == "") {
                smallestWord = word;
            } else if(smallestWord.length() > word.length()) {
                smallestWord = word;
            }
        }



        String answer = smallestWord;
        int i = answer.length();

        for (String s : strs) {

            while (i >= 0) {
                // if string starts with the whole answer string
                // break and go to the next string element
                if (s.startsWith(answer.substring(0, i))) {
                    answer = answer.substring(0, i);
                   break;
                }

                // if string doesn't start with answer
                // decrement the length of the word by 1
                i--;
            }

        }

        return answer;

    }
}
