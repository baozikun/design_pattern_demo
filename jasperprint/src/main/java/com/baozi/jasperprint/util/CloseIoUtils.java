package com.baozi.jasperprint.util;

import java.io.Closeable;
import java.io.IOException;

public class CloseIoUtils {
    /**
     * 做一个关闭流接口的形参，里面的参数代表可变参数，不管传进来多少个参数都会放到数组里面
     */
    public static void closeAll(Closeable... cs) {
        // 遍历数组
        if (cs != null) {
            for (Closeable c : cs) {
                // 只要传进来的不是空的都给它把流关闭
                if (c != null) {
                    try {
                        c.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

}
