public class Solution {
    // The method is now static and takes only one array.
    public static int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    // Correct syntax for returning a new array
                    return new int[]{i, j};
                }
            }
        }
        // Return an empty array if no solution is found.
         return new int[]{};
    }

     public static void main(String args[]) {
        int[] arr = {2,7,11,15};
        int target = 9;
        // Correctly call the static twoSum method.
        int[] ans = twoSum(arr, target); 
        if (ans.length == 0) {
            System.out.println("No two sum solution found.");
        } else {
            // Using System.out for consistency.
            System.out.println("Indices are: " + ans[0] + " and " + ans[1]);
        }
    }

}