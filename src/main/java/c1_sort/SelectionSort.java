package c1_sort;

public class SelectionSort {

    /*
     * 选择排序
     * 从第0个元素开始，把1到最后一位的元素与之比较，找出最小的，放在第0位
     * 然后从第1个元素开始，把2到最后一位的元素与之比较，找出最小的，放在第1位
     * */
    public static void selectionSort(int[] arr) {

        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 0; i < arr.length - 1; i++) {

            int _minVal = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[_minVal]) {
                    _minVal = j;
                }
            }
            swap(arr, i, _minVal);
        }

    }

    public static void swap(int[] arr, int i, int j) {
        if (i == j) {
            return;
        }
        int tempVal = arr[i];
        arr[i] = arr[j];
        arr[j] = tempVal;
    }

    public static void main(String[] args) {
        int[] arr = {4, 6, 78, 1, 4, 5, 7};
        selectionSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
