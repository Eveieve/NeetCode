package Concatenation_of_Array_1929;

import java.util.Arrays;

class Solution {
    public int[] getConcatenation(int[] nums) {
        // create an array ans of length 2n

        // nums array is given - no need to create nums array
        int[] ans = new int[nums.length*2];

        for(int i =0; i<nums.length; i++){ // loop
            ans[i] = nums[i]; //
            ans[i + nums.length] = nums[i]; // add number of nums.length to the ans array. Assign nums array element
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        //solution.getConcatenation([1,3,2,1]); // I thought I can directly pass the array in java

        // Must create array first
        int[] nums = new int[]{1, 3, 2, 1};
        int[] result = solution.getConcatenation(nums);

        // Print the result
        System.out.println(Arrays.toString(result)); // result is an array

    }
}

