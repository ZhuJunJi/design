package com.study.algorithms;

import java.util.Arrays;
import java.util.List;
import static com.study.algorithms.SortUtils.*;
/**
 * 冒泡排序
 * Created by J.zhu on 2019/5/17.
 */
public class BubbleSort implements SortAlgorithm {

    @Override
    public <T extends Comparable<T>> T[] sort(T[] array) {
        int last = array.length;
        // 提高性能
        boolean swap;
        for (int i = last; i > 0; i--) {
            swap = false;
            for (int j = 0; j < i-1; j++) {
                if(less(array[j],array[j+1])){
                    swap = swap(array,j,j+1);
                }
            }
            // 内部循环已经没有交换过了说明已经有序了，停止外层循环
            if (!swap){
                break;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        Integer[] array = {4, 23, 6, 78, 1, 54, 231, 9, 12};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(array);
        List<Integer> lists = Arrays.asList(4,23,6,78,1,54,231,9,12);
        print(array);
        print(bubbleSort.sort(lists));
    }
}
