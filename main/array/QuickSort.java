package main.array;

public class QuickSort extends Sort {
    @Override
    public int[] sort(int[] src) {
        int[] res = src.clone();
        subSort(res, 0, res.length - 1);
        return res;
    }

    private void subSort(int[] src, int left, int right) {
        if(left >= right) return;
        int l = left, r = right, p = src[left];
        while(l < r) {
            while(l < r && src[r] >= p) r--;
            src[l] = src[r];
            while(l < r && src[l] <= p) l++;
            src[r] = src[l];
        }
        src[l] = p;
        subSort(src, left, l - 1);
        subSort(src, l + 1, right);
    }
}
