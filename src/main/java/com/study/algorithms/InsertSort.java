package com.study.algorithms;

import java.util.Arrays;
import java.util.List;

import static com.study.algorithms.SortUtils.less;
import static com.study.algorithms.SortUtils.print;
/**
 * 插入排序
 * Created by J.zhu on 2019/5/22.
 */
public class InsertSort implements SortAlgorithm {
    @Override
    public <T extends Comparable<T>> T[] sort(T[] array) {
        int len = array.length;
        int minIdx;
        for (int i = 1; i < len; i++) {
            T min = array[i];
            minIdx = i;
            for (int j = 0; j < i; j++) {
                if(less(min,array[j])){
                    minIdx = j;
                    break;
                }
            }
            if (i - minIdx > 0) {
                System.arraycopy(array, minIdx, array, minIdx + 1, i - minIdx);
                array[minIdx] = min;
            }

        }
        return array;
    }

    public static void main(String[] args) {
        Integer[] array = {4, 23, 6, 78, 1, 54, 231, 9, 12};
        SortAlgorithm selectionSort = new InsertSort();
        selectionSort.sort(array);
        List<Integer> lists = Arrays.asList(4,23,6,78,1,54,231,9,12);
        print(array);
        print(selectionSort.sort(lists));
    }
}
