import java.util.Comparator;
import java.util.TreeMap;

public class SortThePeople {
    public String[] sortPeople(String[] names, int[] heights) {
        String[]result = new String[names.length];
        TreeMap<Integer,String> m1 = new TreeMap<>(Comparator.reverseOrder());
        for (int i = 0;i<names.length ;i++){
            m1.put(heights[i],names[i]);}
        int i = 0;
        for (int h: m1.keySet()) {
            result[i++]=m1.get(h);
        }
        return result;
    }
}
