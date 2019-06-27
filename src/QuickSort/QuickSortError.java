package QuickSort;

import java.util.Arrays;

// 这是一个错误的算法，具体的示例有没看懂写的
public class QuickSortError {
    private void quickSort(int arr[], int n) {

        quickSort(arr, 0, n - 1);
    }

    private void quickSort(int arr[], int l, int r) {
        if (l >= r) {
            return;
        }
        int p = partition(arr, l, r);
        quickSort(arr, l, p - 1);
        quickSort(arr, p + 1, r);
    }

    private int partition(int[] arr, int l, int r) {
        int v = arr[l];
        int j = l;
        for (int i = l + 1; i <= r; i ++) {
            if (arr[i] < v) {
                swap(arr[j + 1], arr[i]);
                j ++;
            }
        }
        swap(arr[l], arr[j]);
        return j;

    }


    private void swap (int i, int j) {
        int temp = j;
        j = i;
        i = temp;
    }

    public static void main(String[] args) {
        int arr[] = {8, 7, 6, 5, 4, 3, 2, 1};
        QuickSortError q = new QuickSortError();
        q.quickSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }


}
