package main.array;

public class BubbleSort extends Sort {
    @Override
    public int[] sort(int[] src) {
        int[] res = src.clone();
        for (int i = 1; i < src.length; i++) {
            boolean hasSwap = false;
            for (int j = i; j < src.length; j++) {
                if (res[j] < res[j - 1]) {
                    swap(res, j, j - 1);
                    hasSwap = true;
                }
            }
            if(!hasSwap) break;
        }
        return res;
    }
}
