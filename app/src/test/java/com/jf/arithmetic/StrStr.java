package com.jf.arithmetic;

import org.junit.Test;

/**
 * @ProjectName: ArithmeticApp
 * @Package: com.jf.arithmetic
 * @ClassName: StrStr
 * @Description: java类作用描述   给你两个字符串 haystack 和 needle ，请你在 haystack 字符串中找出 needle 字符串出现的第一个位置（下标从 0 开始）。如果不存在，则返回  -1 。
 * @Author: liujianfeng17
 * @CreateDate: 2021/5/24 9:23 AM
 * @UpdateUser: 更新者：
 * @UpdateDate: 2021/5/24 9:23 AM
 * @UpdateRemark: 更新说明：
 * @Version: 1.0
 */
public class StrStr {
    @Test
    public void main() {
        strStr("hello", "ll");
    }

    public void strStr(String haystack, String needle) {
        int n = haystack.length(), m = needle.length();
        for (int i = 0; i + m <= n; i++) {
            if (haystack.contains(needle)) {
                if (haystack.substring(i, i + needle.length()).equals(needle)) {
                    System.out.println(i);
                } else {
                    System.out.println(-1);
                }
            } else {
                System.out.println(-1);
            }
        }
        System.out.println(-1);
    }
}
