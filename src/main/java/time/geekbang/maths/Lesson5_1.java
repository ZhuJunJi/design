package time.geekbang.maths;

import java.util.ArrayList;

/**
 * Lesson 5_1 递归
 * 1、在递归中，每次嵌套调用都会让函数体生产自己的局部变量，
 *    正好可以用来保存不同状态下的数值，为我们省去了大量中间变量的操作、极大地方便了设计和变成。
 * 2、递归就是将复杂的问题，每次都解决一点点，并将剩下的任务转化成为更简单的问题等待下次求解，
 *    如此反复，直到最简单的形式。
 * 3、递归和循环其实都是迭代的实现，而且在某些场合下，他们的实现时可以互相转化的。
 * Created by J.zhu on 2019/5/27.
 */
public class Lesson5_1 {
    /**
     * 4种面额的纸币
     */
    public static long[] rewards = {1, 2, 5, 10};

    public static void get(long totalReward, ArrayList<Long> result){
        // 递归出口当金额为0时符合要求打印结果
        if(totalReward == 0){
            System.out.println(result);
        }else {
            if(totalReward < 0){
                return;
            }else {
                for (int i = 0; i < rewards.length; i++) {
                    ArrayList<Long> newResult = (ArrayList<Long>)result.clone();
                    newResult.add(rewards[i]);
                    get(totalReward - rewards[i],newResult);
                }
            }
        }
    }

    /**
     * 一个整数可以被分解为多个整数的乘积，例如，6 可以分解为2x3。请使用递归编程的方法，为
     * 给定的整数 n，找到所有可能的分解（1 在解中最多只能出现 1 次）。例如，输入 8，输出可
     * 以是 1x8, 8x1, 2x4, 4x2, 1x2x2x2, 1x2x4, ……
     */
    @SuppressWarnings("unchecked")
    public static void decompositionFactor(int num,ArrayList<Integer> result){
        if(num == 1){
            if(!result.contains(1)) result.add(1);
            System.out.println(result);
        }else {
            for (int i = 1; i <= num; i++) {
                if(result.contains(1) && i == 1) continue;
                ArrayList<Integer> newResult = (ArrayList<Integer>)result.clone();
                newResult.add(i);
                if(num % i == 0){
                    decompositionFactor(num / i, newResult);
                }
            }
        }
    }

    public static void main(String[] args) {
        decompositionFactor(8,new ArrayList<>());
//        recursion(8L,new ArrayList<>());
    }

}
