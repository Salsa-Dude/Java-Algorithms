import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome(313));
		
	}
	
	public static boolean isPalindrome(int x) {
		
		if(x < 0) {
			return false;
		}
			
		int reverseNum = 0;
		int copyX = x;
		
		
		while(copyX != 0) {
			// get the last digit of copyX
			int lastDigit = copyX % 10;
			
			// multiply reverseNum by 10 to update the place value
			reverseNum *= 10;
			
			reverseNum += lastDigit;
			// downgrade copyX place value
			copyX /= 10;
		}
		
		
		return reverseNum == x;
		
		
	}
	
	// Converting number into a string 
	
//	public static boolean isPalindrome(int x) {
//		
//		if(x < 0) {
//			return false;
//		}
//        
//		String newString = "";
//		// This method returns the string representation of the passed argument.
//		String stringNum = String.valueOf(x);
//		
//		for(int i = stringNum.length() - 1; i >= 0; i--) {
//			//charAt(index) method returns the character at the specified index. 
//			newString += stringNum.charAt(i);
//		}
//		
//		System.out.println(Long.valueOf(newString));
//		System.out.println(Long.valueOf(x));
//		
//		
//		
//		if(Long.valueOf(newString).equals(Long.valueOf(x))) {
//			return true;
//		} else {
//			return false;
//		}
//		
//	}

}
