package time.geekbang.maths;

import java.math.BigInteger;

/**
 * 极客时间，程序员的数学基础
 * 一、第一课
 *    二进制、不了解计算机的源头，你学什么编程
 *
 * 1、什么是二进制？
 *    十进制数是使用10作为基数，二进制使用2作为基数，二进制的数位就是2^n的形式
 * 2、计算机为什么使用二进制？
 *    二进制数据表达具有抗干扰能力强、可靠性高的优点;
 *    二进制非常适合逻辑运算
 * 3、二进制的位操作
 *    位移操作：
 *        二进制左移一位，就是将数字翻倍。二进制右移一位，就是将数字除以2并求整数商
 *    逻辑操作：
 *        "或"：  参与操作的位中只要有一个是1，最终结果就是1。
 *        "与"：  参与操作的位中必须全是1，最终结果才是1，否者结果是0。
 *        "异或"：参与财政的位相同，最终结果是0，否者结果是1。
 * Created by J.zhu on 2019/5/23.
 */
public class Lesson1_1 {
    /**
     * 十进制数转换为二进制
     * @param decimalSource   十进制
     * @return String         二进制
     */
    public static String decimalToBinary(int decimalSource){
        BigInteger bi = new BigInteger(String.valueOf(decimalSource));
        return bi.toString(2);
    }

    /**
     * 二进制转换为十进制
     * @param binarySource  二进制
     * @return int          十进制
     */
    public static int binaryToDecimal(String binarySource){
        BigInteger bi = new BigInteger(binarySource,2);
        return bi.intValue();
    }

    /**
     * 向左位移
     * @param num   要左移的十进制数
     * @param m     左移的位数
     * @return      num左移m位后的结果
     */
    public static int leftShift(int num,int m){
        return num << m;
    }

    /**
     * 向右位移
     * @param num   要右移的十进制数
     * @param m     右移的位数
     * @return      num右移m位后的结果
     */
    public static int rightShift(int num,int m){
        return num >>> m;
    }

    public static void main(String[] args) {
        int decimalSource = 53;
        String binary = decimalToBinary(decimalSource);
        System.out.println(String.format("将十进制数 %d 转换为二进制：%s ",decimalSource,binary));
        int decimal = binaryToDecimal(binary);
        System.out.println(String.format("将二进制数 %s 转换为十进制：%d ",binary,decimal));

        int m = 1;
        int leftShift = leftShift(decimalSource, m);
        System.out.println(String.format("将十进制数 %d 左移 %d 位后结果：%d ",decimalSource,m,leftShift));
        int rightShift = rightShift(decimalSource, m);
        System.out.println(String.format("将十进制数 %d 右移 %d 位后结果：%d ",decimalSource,m,rightShift));
    }


}
