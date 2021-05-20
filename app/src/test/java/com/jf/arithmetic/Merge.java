package com.jf.arithmetic;

import org.junit.Test;

import java.util.Arrays;

/**
 * @ProjectName: ArithmeticApp
 * @Package: com.jf.arithmetic
 * @ClassName: Merge
 * @Description: java类作用描述 归并排序
 * @Author: liujianfeng17
 * @CreateDate: 2021/5/19 9:56 PM
 * @UpdateUser: 更新者：
 * @UpdateDate: 2021/5/19 9:56 PM
 * @UpdateRemark: 更新说明：
 * @Version: 1.0
 */
public class Merge {
    @Test
    public void main() {
        int[] arr = { 8, 7, 6, 5, 4, 3, 2, 1};
        int[] temp = new int[arr.length];
        mergeSort(arr, 0, arr.length - 1, temp);
        System.out.println(Arrays.toString(arr));
    }
    private void mergeSort(int[] arr, int left, int right, int[] temp) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid, temp);
            mergeSort(arr, mid + 1, right, temp);
            merge(arr, left, mid, right, temp);
        }
    }

    private void merge(int[] arr, int left, int mid, int right, int[] temp) {
        int i = left;//左序列指针
        int j = mid + 1;//右序列指针
        int t = 0;//临时数组指针
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[t++] = arr[i++];
            } else {
                temp[t++] = arr[j++];
            }
        }
        while (i <= mid) {//将左边剩余元素填充进temp中
            temp[t++] = arr[i++];
        }
        while (j <= right) {//将右序列剩余元素填充进temp中
            temp[t++] = arr[j++];
        }
        t = 0;
        //将temp中的元素全部拷贝到原数组中
        while (left <= right) {
            arr[left++] = temp[t++];
        }
    }
}
