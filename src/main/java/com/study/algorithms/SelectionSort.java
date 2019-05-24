package com.study.algorithms;

import java.util.Arrays;
import java.util.List;
import static com.study.algorithms.SortUtils.*;
/**
 * 选择排序
 * Created by J.zhu on 2019/5/22.
 */
public class SelectionSort implements SortAlgorithm {
    @Override
    public <T extends Comparable<T>> T[] sort(T[] array) {
        int len = array.length;
        int minIdx;
        for (int i = 0; i < len; i++) {
            minIdx = i;
            for (int j = i + 1; j < len; j++) {
                if(less(array[j],array[minIdx])){
                   minIdx = j;
                }
            }
            if(i != minIdx){
                swap(array,i,minIdx);
            }
        }
        return array;
    }

    public static void main(String[] args) {
        Integer[] array = {4, 23, 6, 78, 1, 54, 231, 9, 12};
        SortAlgorithm selectionSort = new SelectionSort();
        selectionSort.sort(array);
        List<Integer> lists = Arrays.asList(4,23,6,78,1,54,231,9,12);
        print(array);
        print(selectionSort.sort(lists));
    }
}
