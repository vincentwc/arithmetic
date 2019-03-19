package demo;

import org.junit.Test;

/**
 * 此demo类是用来测试...
 */
public class DemoTest {

    /**
     * 测试异或运算
     *    将数字转换为二进制数字，相同为0，不同为1，然后在转化为十进制
     *    相同的数字异或运算  = 0
     *    任何数字与0异或运算 = 数字本身
     */
    @Test
    public void test1(){
        System.out.println(0^0);
        System.out.println(0^1);
        System.out.println(1^10);
        System.out.println(1^20);
        System.out.println(211^1);
        System.out.println(22^2);
        /***
         *  1100
         *  0010
         *  =
         *  1110
         */
        System.out.println(12^2);
    }

    @Test
    public void test2(){
        int i = 3,y = 5;
        System.out.println(--i);
        System.out.println(y--);
    }
}
