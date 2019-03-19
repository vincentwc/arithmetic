package 字符串.验证回文串;

public class Solution {

    public static void main(String[] args) {

    }

    public boolean isPalindrome(String s) {
        char[] chars = s.toCharArray();
        int i = 0, j = chars.length - 1;
        while (i < j){
            if (!Character.isLetterOrDigit(chars[i])){
                i++;
//                continue;  可以不加continue，因为走进了该分支，后续的分支是不会进去的，进入到下一个循环，与continue效果一样
            }else if (!Character.isLetterOrDigit(chars[j])){
                j--;
            }else {
                if (Character.toLowerCase(chars[i]) == Character.toLowerCase(chars[j])){
                    i++;
                    j--;
                }else {
                    return false;
                }
            }
        }
        return true;
    }
}
