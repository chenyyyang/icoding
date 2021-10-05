package arrays;

public class 双指针问题 {
    /*
    荷兰国企问题 需要升级一下
     * 给定一个数组，给定一个数
     * 数组中 小于这个num的 都放在左侧，大于这个num的都放在右侧
     * 要求空间复杂度 O 1
     * */
    public static void main(String[] args) {
        int[] arr = {4, 6, 78, 1, 4, 5, 7};
        int num = 78;

        int minLimits = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < num) {
                swap(arr, minLimits, i);
                minLimits++;
            }

        }

        for (int _e : arr) {
            System.out.println(_e);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

}
