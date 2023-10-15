package main.array;

import main.common.PrintHelper;

import java.util.Arrays;

public class ArrayTest {

    public static void main(String[] args) {
        int[] arr = new int[]{-1, 0, 2, 366, 3, 23423, 56, 56, 444};
        BubbleSort bubbleSort = new BubbleSort();
        InsertSort insertSort = new InsertSort();
        QuickSort quickSort = new QuickSort();
        System.out.println(PrintHelper.toString(bubbleSort.sort(arr)));
        System.out.println(PrintHelper.toString(insertSort.sort(arr)));
        System.out.println(PrintHelper.toString(quickSort.sort(arr)));
    }


}
