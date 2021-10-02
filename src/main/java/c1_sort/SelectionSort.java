package c1_sort;
/*
* 冒泡排序
比较相邻的元素。如果第一个比第二个大，就交换他们两个。
对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。这步做完后，最后的元素会是最大的数。
针对所有的元素重复以上的步骤，除了最后一个。
持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。*/
public class SelectionSort {

    /*
     * 选择排序
     * 从第0个元素开始，把1到最后一位的元素与之比较，找出最小的，放在第0位
     * 然后从第1个元素开始，把2到最后一位的元素与之比较，找出最小的，放在第1位
     *
     * 时间复杂度 N² 空间复杂度 O(1)
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
