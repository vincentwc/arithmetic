package 只出现一次的数字;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        int[] nmus = {4, 1, 2, 2, 1};
        singleNumber(nmus);
    }

    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);  //排序数组
        for (int i = 0; i < nums.length - 1; i += 2) {
            //i一次跳两个位置
            if (nums[i] != nums[i + 1]) {
                System.out.println(nums[i]);
                return nums[i];
            }
        }
        System.out.println(nums[nums.length - 1]);
        return nums[nums.length - 1];
    }

    public static int singleNumber2(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length - 1; i++) {
            boolean add = set.add(nums[i]);
            // add成功返回true，如果set中已有相同数字，则add方法会返回false
            if (!add) {
                //false，则说明set中已有该元素，删除它
                set.remove(nums[i]);
            }
        }
        //返回set中还剩下的一个元素
        return set.iterator().next();
    }

    public static int singleNumber3(int[] nums) {
        int num = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            // 偶数下标位置 num += nums[i]，奇数下标位置 num -= nums[i]
            num = i % 2 == 0 ? num + nums[i] : num - nums[i];
        }
        return num;
    }

    /**
     *   {1,2,3,4,2,1,3}
     * @param nums
     * @return
     */
    public static int singleNumber4(int[] nums) {
       int num = 0 ;
        for (int i = 0; i < nums.length - 1; i++) {
            num = num ^ nums[i];
        }
        return num;
    }
}
