package com.jf.arithmetic;

import org.junit.Test;

import java.util.Arrays;

/**
 * @ProjectName: ArithmeticApp
 * @Package: com.jf.arithmetic
 * @ClassName: Bubble
 * @Description: java类作用描述 冒泡排序
 * @Author: liujianfeng17
 * @CreateDate: 2021/5/18 6:36 PM
 * @UpdateUser: 更新者：
 * @UpdateDate: 2021/5/18 6:36 PM
 * @UpdateRemark: 更新说明：
 * @Version: 1.0
 */
public class Bubble {
    @Test
    public void main() {
        String a = "hello";
        String b = "world!";
        String ab = a + b;
        System.out.println(ab);//验证"+"运算符，其实跳用了StringBuilder的使用 考虑一下String StringBuffer StringBuilder区别的区别
        int[] array = {29, 10, 14, 37, 20, 25, 44, 15};
//        doBubbleSort(array);
//        doBubbleBetterSort(array);
        doBubbleBestSort(array);
    }

    /**
     * 这个算法就是两层遍历，外层遍历表示的是进行的轮数。内层遍历表示的是每一轮的排序
     *
     * @param array
     */
    public void doBubbleSort(int[] array) {
        System.out.println("排序前的数组为:" + Arrays.toString(array));
        //外层循环,遍历所有轮数
        for (int i = 0; i < array.length - 1; i++) {
            //内层循环，两两比较，选中较大的数字，进行交换
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    //交换两个数字
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
            System.out.println("第" + (i + 1) + "轮排序后数组为:" + Arrays.toString(array));
        }
    }

    /**
     * 分析上面的遍历过程，我们可以发现，第一次排序之后，44已经放到最右边的位置了，已经排好序了。
     * 第二次排序之后，37也已经排好序了。每过一轮，内部循环需要比较的次数就可以减一。
     * 这就意味着，在内部循环的时候，我们只需要进行array.length-i-1次比较就可以了。
     *
     * @param array
     */
    public void doBubbleBetterSort(int[] array) {
        System.out.println("排序前的数组为:" + Arrays.toString(array));
        //外层循环,遍历所有轮数
        for (int i = 0; i < array.length - 1; i++) {
            //内层循环，两两比较，选中较大的数字，进行交换
            for (int j = 0; j < array.length - 1 - i; j++) {//
                if (array[j] > array[j + 1]) {
                    //交换两个数字
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
            System.out.println("第" + (i + 1) + "轮排序后数组为:" + Arrays.toString(array));
        }
    }

    public void doBubbleBestSort(int[] array) {
        System.out.println("排序前的数组为:" + Arrays.toString(array));
        //外层循环,遍历所有轮数
        for (int i = 0; i < array.length - 1; i++) {
            //内层循环，两两比较，选中较大的数字，进行交换
            boolean flag = false;
            for (int j = 0; j < array.length - 1 - i; j++) {//
                if (array[j] > array[j + 1]) {
                    //交换两个数字
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    flag = true;
                }
            }
            System.out.println("第" + (i + 1) + "轮排序后数组为:" + Arrays.toString(array));
            if (!flag) {
                System.out.println("第" + (i + 1) + "轮排序未发生排序变化");
                return;
            }

        }
    }
}
