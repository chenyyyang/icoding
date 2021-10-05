package arrays.c1_sort;
/*
 * 插入排序
 * 4，7，2，3，100，17，24
 * 这样的一个数组，依次的从左往右，选择
 * 4 7 排序
 * 4 7 2 排序  247
 * 2 4 7 3 排序 2 3 4 7
 * 所以最坏情况 是On²  但是，最好情况 123456 是On
 * 算法的时间复杂度按照最坏的情况来 O 这种的.
 * 而 冒泡排序 选择排序必然是O n²
 *
 * */

public class InsertionSorting {

    public static void insertionSort(int[] arr) {

        if (arr == null || arr.length < 1) {
            return;
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }

    }

    public static void swap(int[] arr, int i, int j) {
        if (i == j) {
            return;
        }
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }

    public static void main(String[] args) {
        int[] arr = {4, 6, 78, 1, 4, 5, 7};
        insertionSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }

}
