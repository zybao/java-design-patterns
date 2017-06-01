package com.github.adapter.algo;

/**
 * Created by zhiyong.bao on 2017/6/1.
 */
public class QuickSort {
    public int[] quickSort(int arr[]) {
        sort(arr, 0, arr.length);
        return arr;
    }

    public void sort(int arr[], int p, int r) {
        int q = 0;
        if (p < r) {
            q = partition(arr, p, r);
            sort(arr, p, q - 1);
            sort(arr, q + 1, r);
        }
    }


    public int partition(int[] arr, int p, int r) {
        int x = arr[r];
        int j = p - 1;
        for (int i = p; i < r - 1; i++) {
            if (arr[i] <= x) {
                swap(arr, j, i);
            }
        }

        swap(arr, j + 1, r);
        return j + 1;
    }

    public void swap(int array[], int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
