import java.util.ArrayList;

public class ReverseInteger {

	public static void main(String[] args) {

		int test = reverse(1534236469);
		System.out.println(test);
		
	}
	
	public static int reverse(int x) {
        
        if(x == 0) {
			return 0;
		} 

        // The Integer.toString() method converts int to String. The toString() is the static method of Integer class.
		// The signature of toString() method is given below:
		String stringNum = Integer.toString(x);
		int sign;
		
		if(x > 0) {
			sign = 1;
		} else {
			sign = -1;
			stringNum = stringNum.substring(1, stringNum.length());
		}
		
		String newString = "";
		
		for(int i = stringNum.length() - 1; i >= 0; i--) {
        // System.out.println(stringNum.charAt(i));
			newString += stringNum.charAt(i);
		}
        
        if(Long.valueOf(newString) > Integer.MAX_VALUE || Long.valueOf(newString) < Integer.MIN_VALUE) {
			return 0;
		}
		
		return Integer.valueOf(newString) * sign;
		
	}
     

}
