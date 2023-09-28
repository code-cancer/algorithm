import Common.PrintHelper;

/**
 * 1.
 * 2.
 * 3.
 * 4.
 */

class Sort {

    public int[] selectSort(int[] arr) {
        int[] res = arr.clone();
        for (int front = 0; front < res.length; front++) {
            for (int last = front + 1; last < res.length; last++) {
                if (res[last] < res[front]) {
                    int temp = res[front];
                    res[front] = res[last];
                    res[last] = temp;
                }
            }
        }
        return res;
    }

    public int[] bubbleSort(int[] arr) {
        int[] res = arr.clone();
        int bubbleCount = 0;
        for (int j = 0; j < res.length - 1; j++) {
            for (int i = 0; i < res.length - bubbleCount - 1; i++) {
                if (res[i] > res[i + 1]) {
                    int temp = res[i];
                    res[i] = res[i + 1];
                    res[i + 1] = temp;
                }
            }
        }
        return res;
    }

    public int[] insertSort(int[] arr) {
        int[] res = arr.clone();
        for(int i = 0; i < res.length; i++) {
            for(int j = i + 1; j < res.length; j++) {
                for(int k = j; k > 0; k--) {
                    if(res[k] < res[k - 1]) {
                        int temp = res[k];
                        res[k] = res[k - 1];
                        res[k - 1] = temp;
                    break;
                    }
                }
            }
        }
        return res;
    }

    

    public static void main(String[] args) {
        int[] testArr = new int[] { 4, 5, 6, 123, 69, 9, 7, 876, 3, 5 , -1, 0, 1};
        Sort sort = new Sort();
        int[] selectSortRes = sort.selectSort(testArr);
        int[] bubbleSortRes = sort.bubbleSort(testArr);
        int[] insertSortRes = sort.insertSort(testArr);
        System.out.println("选择排序：" + PrintHelper.toString(selectSortRes));
        System.out.println("冒泡排序：" + PrintHelper.toString(bubbleSortRes));
        System.out.println("插入排序：" + PrintHelper.toString(insertSortRes));
    }

}