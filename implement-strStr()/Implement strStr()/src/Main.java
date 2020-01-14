

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(strStr("mississippi",
				"pi"));

	}
	
	 public static int strStr(String haystack, String needle) {
		 /*
	        * If haystack is null
	        * or
	        * if needle is null
	        * or
	        * if the haystack string is shorter than the needle string
	        * Return -1 */
	        if(haystack == null || needle == null || haystack.length() < needle.length()) {
	            return -1;
	        }

	        /*
	        * If the needle string is empty, return 0
	        * */
	        if(needle.equals("")){
	            return 0;
	        }
	        
	       // Traverse through the haystack string 
	        // While i is less than the (length of haystack - the length of needle + 1) 
	        // This will give us the last index in haystack that we can check for the substring value
	        for(int i = 0; i < haystack.length() - needle.length() + 1; i++) {
	        	if(haystack.charAt(i) == needle.charAt(0)) {
	        		String subString = haystack.substring(i,i + needle.length());
	        		if(subString.equals(needle)) {
	        			return i;
	        		}
	        	}
	        }
	        
	     
	        return -1;
	        
	       
	 }

}
