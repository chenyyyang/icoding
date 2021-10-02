package c1_sort;

/*
 *   & 与运算  101 & 000 = 000
 *   ~ 取反运算  ~ 101 = 010
 *   ^ 异或运算  100 & 010 = 110   异或就是 相同的得到0   不同的话得到1
 *
 * */
public class XORnonequivalenceOperation {

    //找出数组中，出现了奇数次的数。时间复杂度O(n),空间复杂度O(1)
    //依据的就是  交换律和结合律，
    // 把整个数组的所有数都异或一遍
    public static void main1(String[] args) {
        int[] numbers = {2, 3, 2, 3, 5};

        int eor = 0;
        for (int i = 0; i < numbers.length; i++) {

            eor = eor ^ numbers[i];
        }
        System.out.println(eor);
    }

    //异或运算 实现 swap
    // 异或就是  相同的得到0   不同的话得到1  。。等于是 01 相加，但是不会进行进位运算
    //相同的两个Int值  异或运算得到0 。0异或任何数都还是0
    // 连续 异或运算 可以进行交换 和结合
    public static void main(String[] args) {
        System.out.println(4 ^ 2);//这边得到是 6 ，不是1，因为位运算

        int[] ints = {2, 3};
        swapExtra(ints, 0, 0);
        System.out.println(ints[0] + "  " + ints[1]);
    }

    public static void swapExtra(int[] arr, int i, int j) {
        if (i == j) {
            return;
        }
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }
}
