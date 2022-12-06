import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class TwoOutOfTree {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        HashSet<Integer> arr = new HashSet<>();

        for (int a : nums1)
            for(int b : nums2)
                if (a==b) arr.add(b);

        for (int b: nums2)
            for (int c: nums3)
                if(b==c) arr.add(c);

        for (int c: nums3)
            for (int a: nums1)
                if(c==a) arr.add(c);

        return new ArrayList<>(arr);
    }
}
