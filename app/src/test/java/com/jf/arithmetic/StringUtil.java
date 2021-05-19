package com.jf.arithmetic;

/**
 * @ProjectName: ArithmeticApp
 * @Package: com.jf.arithmetic
 * @ClassName: StringUtil
 * @Description: java类作用描述
 * @Author: liujianfeng17
 * @CreateDate: 2021/5/19 5:27 PM
 * @UpdateUser: 更新者：
 * @UpdateDate: 2021/5/19 5:27 PM
 * @UpdateRemark: 更新说明：
 * @Version: 1.0
 */
public class StringUtil {
    public static String print(int[] array) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i <= array.length - 1; i++) {
            sb.append(array[i] + ",");
        }
        return sb.toString();
    }


}
