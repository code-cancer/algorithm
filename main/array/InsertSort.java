package main.array;

public class InsertSort extends Sort {
    @Override
    public int[] sort(int[] src) {
        int[] res = src.clone();
        for (int i = 1; i < res.length; i++) {
            for (int j = i; j > 0; j--) {
                if (res[j] < res[j - 1]) {
                    swap(res, j, j - 1);
                }
            }
        }
        return res;
    }
}
