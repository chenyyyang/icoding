package arrays.c1_sort;

/*
 *
 * 荷兰国旗升级版问题
 *
 * 拿数组最后一个数字 作为划分依据，比如5
 *小于5的放数组左边，等于5的放中间，大于5的放右边
 *
 * 然后左右再次进行递归排序
 *
 * 时间复杂度 O（N²）（最差情况） 最好情况是 N*logN
 *
 *
 * */
public class QuickSortV1 {

    /**
     * 数组内元素交换
     *
     * @param nums 输入数组
     * @param i 元素1下标
     * @param j 元素2下标
     */
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    /**
     * 快速排序
     *
     * @param nums 输入数组
     * @param left 划分左边界
     * @param right 划分右边界
     */
    private void quickSort(int[] nums, int left, int right) {
        // 递归返回条件，和分区排序结束
        if (right - left <= 0) {
            return;
        }
        // 选择数组右边界值作为分区节点
        int pivot = nums[right];
        // 从数组左边界值开始维护分区
        int partition = left - 1;
        // 遍历当前分区内元素2
        for (int i = left; i <= right - 1; i++) {
            if ((nums[i] < pivot)) {
                // 将小于pivot的值交换到partition左边
                // 将大于等于pivot的值交换到partition右边
                partition++;
                swap(nums, partition, i);
            }
        }
        // 将分区节点插入到数组左右分区中间
        partition++;
        swap(nums, partition, right);
        // 分区节点排序完成
        // 左分区继续排序，右分区继续排序
        quickSort(nums, left, partition - 1);
        quickSort(nums, partition + 1, right);
    }

    /**
     * 排序数组入口函数
     *
     * @param nums 输入数组
     * @return 返回完成排序的数组
     */
    public int[] sortArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return nums;
        }
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }

   /* 作者：wonderzlf
    链接：https://leetcode-cn.com/problems/sort-an-array/solution/javakuai-su-pai-xu-jian-xi-by-wonderzlf/
    来源：力扣（LeetCode）
    著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。*/
}
