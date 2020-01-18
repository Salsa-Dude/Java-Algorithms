import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,3,5,6};
		System.out.println(searchInsert(nums,7));
	}
	
	 public static int searchInsert(int[] nums, int target) {
		 
		 if(nums == null || nums.length == 0) return 0;
		 
		 // lowest index
		 int low = 0;
		 // highest index
		 int high = nums.length - 1;
		 
		 // while the lowest index is less than the highest index
		 while(low <= high) {
			 
			 int mid = (low + high) / 2;
			 
			 if(nums[mid] == target) {
				 return mid;
				 // if the middle index is greater
				 // change highest index to equal the middle index - 1
			 } else if(nums[mid] > target) {
				 high = mid -1;
				 // if the middle index is less
				 // change lowest index to equal the middle index + 1
			 } else if(nums[mid] < target) {
				 low = mid + 1;
			 }
		
		 }
		
		 // the insert index
		 return low;
	 }

}
	