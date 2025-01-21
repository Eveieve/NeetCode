package Contains_Duplicate;

// mySolution

class Solution {
    public boolean hasDuplicate(int[] nums) {
        // select one element and compare it to next element
        // if not the same, go to the next element and compare again.
        // repeat this till the end of the array

        boolean result = false;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length ; j++) {
                if (nums[i] == nums[j] ) { // take the first element and compare it to the second, if not the same, compare the first with the third and so on..
                    if(i !=j){
                        result = true;
                    }else continue;
                } else if(nums[i] != nums[j]) {
                    continue; // go to next loop?
                } else if( i == nums.length -1) {
                    result = false;
                }
            }
        }
        return result;
    }
}




