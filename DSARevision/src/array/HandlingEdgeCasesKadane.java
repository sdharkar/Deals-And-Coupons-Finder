package array;

//problem: Find the maximum subarray sum for negative numbers using Kadane's algorithm.

//logic: 
//1. Initialize a variable maxSum to the first element of the array.
//2. Initialize a variable currentSum to 0.
//3. Iterate through the array and add each element to the currentSum.
//4. If the currentSum is greater than the maxSum, update the maxSum.
//5. If the currentSum is less than 0, set the currentSum to 0.
//6. Return the maxSum.

//Time Complexity: O(n)
//Space Complexity: O(1)

public class HandlingEdgeCasesKadane {

    public static void main(String[] args) {

        int[] nums = {-2, -1, -3, -4, -1, -2, -1, -5, -4};
        System.out.println("Maximum subarray sum is: "+findMaxSubarraySumForNegative(nums));

    }

    public static int findMaxSubarraySumForNegative(int[] nums) {
        int maxSum = nums[0]; //initialize the maxSum to the first element of the array
        int currentSum = 0;
        for(int num : nums){
            currentSum += num;
            if(currentSum > maxSum){
                maxSum = currentSum; 
            }
            if(currentSum < 0){
                currentSum = 0;
            }
        }
        return maxSum;
    }

}