import java.util.HashSet;

public class NRepeated {
    class Solution {
        public int repeatedNTimes(int[] nums) {
            HashSet<Integer> seen = new HashSet<>();
            for(int n : nums) {
                if(seen.contains(n)){
                    return n;
                }
                seen.add(n);
            }
            return 0;
        }
    }
}
