package 搜索二维矩阵;

public class Solution {
    public static void main(String[] args) {

    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0){
            return false;
        }
        int x = 0;
        int y = matrix.length -1;
        while (x < matrix[0].length && y >=0){
            if (matrix[y][x] == target){
                //
                return true;
            }else if (matrix[y][x] > target){
                //大于target，则上移
                y--;
            }else {
                //小于target则右移
                x ++;
            }
        }
        return false;
    }
}
