package time.geekbang.maths;

/**
 * Lesson 3
 * 迭代法
 * Created by J.zhu on 2019/5/23.
 */
public class Lesson3_1 {

    /**
     * 第一个格子放一颗麦子，每个格子的麦子数是前一个格子的两倍
     * 求第N格的麦子总和
     * @param grid  格子数>=1
     * @return long grid个格子的麦子总和
     */
    public static long getNumberOfWheat(int grid){
        long sum = 0;
        long numberOfWheatInGrid = 1;
        sum += numberOfWheatInGrid;
        for (int i = 2; i <= grid; i++) {
            numberOfWheatInGrid *= 2;
            sum += numberOfWheatInGrid;
        }
        return sum;
    }


    /**
     * 计算大于 1 的正整数之平方根
     * @param n                 大于1的正整数
     * @param deltaThreshold    精确度（达到此精确度终止）
     * @param maxTry            最大尝试次数，超过后返回-2.0
     * @return double           平方根的解
     */
    public static double getSqureRoot(int n,double deltaThreshold,int maxTry){
        if (n <= 1){
            return -1.0;
        }
        double min = 1,max = (double)n;
        for (int i = 0; i <= maxTry ; i++) {
           double middle = ( min + max ) / 2;
           double square = middle * middle;
           double delta = Math.abs(square - n);
           if(delta <= deltaThreshold){
               return middle;
           }else {
               if(square>n){
                   max = middle;
               }else {
                   min = middle;
               }
           }
        }
        return -2.0;
    }
    public static void main(String[] args) {
        System.out.println(getNumberOfWheat(63));
        double squreRoot = getSqureRoot(10, 0.0000001, 100000);
        System.out.println(squreRoot);
        System.out.println(squreRoot*squreRoot);
    }

}
