public class Main {

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }


    // Approach 1: Two Pointers
    // Since the array is already sorted, we can keep two pointers i and j,
    // where i is the slow-runner while j is the fast-runner.
    // As long as nums[i] = nums[j], we increment j to skip the duplicate.

    // When we encounter nums[j] != nums[i]
    // the duplicate run has ended so we must copy its value to nums[i + 1].
    // i is then incremented and we repeat the same process again until j reaches the end of array.



    public static int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;

        // slow-runner
        int i = 0;

        for(int j = 1; j < nums.length; j++) {
            // if both numbers don't match
            if(nums[i] != nums[j]) {
                // replace the next element from i with the value of num[j]
                // this will group all unique numbers in the start of the array
                nums[i+1] = nums[j];
                i++;
            }
        }

        // since i is the last unique number index
        // we need to add +1 to display the overall length
        return i + 1;
    }
}
