package Contains_Duplicate;


import java.util.HashSet;
import java.util.Set;

public class Solution3 {
    public boolean hasDuplicate(int[] nums) {

        Set<Integer> seen = new HashSet<>();

        for(int num : nums) {
            if(seen.contains(num))
                return true;

            seen.add(num); // if it's not contained, add to the seen set
        }
        // after the loop is done and it has not returned true,
        return false;
    }

}
