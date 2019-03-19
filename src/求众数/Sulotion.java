package 求众数;

import java.util.HashMap;
import java.util.Map;

public class Sulotion {

    public static void main(String[] args) {

    }

    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for (int num : nums) {
            Integer count = map.get(num);
            if (count == null)count = 1;
            else count++;
            map.put(num,count);
            if (map.get(num) > n/2){
                return num;
            }
        }
        return 0;
    }
}
