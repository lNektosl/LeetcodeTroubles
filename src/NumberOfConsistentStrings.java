import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class NumberOfConsistentStrings {
    class Solution {
        public int countConsistentStrings(String allowed, String[] words) {
            HashSet<Character> map = new HashSet<>();
            int a = 0;
            for (int i = 0; i < allowed.toCharArray().length; i++) {
                map.add(allowed.charAt(i));
            }
            for (String h : words)
                for (int i = 0; i < h.toCharArray().length; i++)
                    if (!map.contains(h.charAt(i))) {
                        break;
                    } else if (i == h.length() - 1) {
                        a++;
                    }
            return a;
        }
    }
}


