public class Main {

    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        removeElement(nums, 3);
    }

    public static int removeElement(int[] nums, int val) {

        if(nums.length == 0) return 0;

        // slow pointer
        // going to represent the beginning of the array
        int i = 0;

        for(int j = 0; j < nums.length; j++) {
            // if current nums[j] doesn't match the val
           if(nums[j] != val) {
               // store it in the beginning of the array which is what the slow pointer is representing.
               nums[i] = nums[j];
               // increment the slow pointer index by +1
               i++;
           }
        }

        return i + 1;
    }
}
