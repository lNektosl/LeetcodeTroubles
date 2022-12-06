public class AbsoluteDifference {
    class Solution {
        int count = 0;
        public int countKDifference(int[] nums, int k) {
            for(int n : nums){
                for(int c : nums)
                    if(n-c == k) count++;//не совсем понял почему это работает без Math.abs(), но это работает
            }
            return count;
        }
    }
}
