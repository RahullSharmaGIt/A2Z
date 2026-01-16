// public class kandaneAlgo{

// public static int algo(int[] nums) {
//     int maxi = Integer.MIN_VALUE;

//     for (int i = 0; i < nums.length; i++) {
//         for (int j = i; j < nums.length; j++) {
//             int sum = 0;
//             for (int k = i; k <= j; k++) {  // ✅ FIXED
//                 sum += nums[k];
//             }
//             maxi = Math.max(maxi, sum);
//         }
//     }
//     return maxi;
// }
    

//     public static void main(String args[]){
//         int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
//         int maxi_sum = algo(arr);  
//         System.out.println("The maximum subarray sum is: " + maxi_sum);
//     }
// }



// better apprach

public class kandaneAlgo {

    public static int algo(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 0; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;

    }
    
         public static void main(String args[]){
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int maxi_sum = algo(arr);  
        System.out.println("The maximum subarray sum is: " + maxi_sum);
    }
}










// int currentSum = 0;
// int maxSum = Integer.MIN_VALUE;

// for (int num : nums) {
//     currentSum += num;
//     maxSum = Math.max(maxSum, currentSum);
//     if (currentSum < 0) currentSum = 0;
// }
