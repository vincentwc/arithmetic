package 合并两个有序数组;

import com.sun.scenario.effect.Merge;

public class Solution {

    public static void main(String[] args) {
        int[] nums1 = {0};
        int[] nums2 = {1};
        merge(nums1, 0, nums2, 1);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // 特别注意这里的m只是nums1中元素的个数，不是最终第一个数组的长度 不要用m=nums1.length;不然会造成数据越界的报错
        int i = m - 1, j = n - 1, index = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                //A大就把A的数组放在更后面
                nums1[index--] = nums1[i--];
            } else {
                nums1[index--] = nums2[j--];
            }
        }
        while (i >= 0) {
            nums1[index--] = nums1[i--];
        }
        while (j >= 0) {
            nums1[index--] = nums2[j--];
        }
        for (int k = 0; k < nums1.length-1; k++) {
            System.out.println(nums1[k]);
        }
    }
}
