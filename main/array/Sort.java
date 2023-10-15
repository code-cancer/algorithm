package main.array;

import main.common.PrintHelper;

abstract class Sort {

    abstract int[] sort(int[] src);

    static void swap(int[] src, int index1, int index2) {
        int temp = src[index1];
        src[index1] = src[index2];
        src[index2] = temp;
    }

}
