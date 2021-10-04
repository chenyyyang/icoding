package search;

/*
 * 在有序数组中，查找某个数是否存在。
 *
 * 时间复杂度 log 2（N） --> 2为底数，假设一共有16个数，8 4 2 1 一共需要判断4次
 * 由于可以忽略常数，可以直接写成 logN
 *
 * 有序数组 查找大于等于 某个数 最左侧的位置
 *
 *
 * 局部最小值问题
 * 在 无顺序的 数组中，相邻的数一定不相等 ，求局部最小值
 * 局部最小值：比左右两边的数都要小
 *
 * 如果开头是局部最小，就是向下的折线。如果尾部是局部最小就是向下的
 * 这时候使用二分
 *
 * */
public class BinarySearch {

    public static void main1(String[] args) {
        int[] arr = {4, 5, 6, 78, 88};
        System.out.println(binarySearch(arr, 78));
    }

    public static int binarySearch(int[] nums, int target) {
        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = (high - low) / 2 + low;
            int val = nums[mid];

            if (target == val) {
                return mid;

            } else if (target < val) {

                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;

    }

    //    ----------------------------------
    // 求数组最大值 ，利用递归来做
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 78, 88};
        System.out.println(getMax(arr, 0, arr.length - 1));
    }

    private static int getMax(int[] arr, int left, int right) {

        if (left == right) {
            return arr[left];
        }

        int mid = (right - left) >> 1 + left;
        int leftMax = getMax(arr, left, mid);
        int rightMax = getMax(arr, mid + 1, right);
        return Math.max(leftMax, rightMax);
    }
}
