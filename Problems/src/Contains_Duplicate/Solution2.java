package Contains_Duplicate;

// Brute Force
// n is the size of input array
// O(n2); big O of n square

public class Solution2 {
    public boolean hasDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
