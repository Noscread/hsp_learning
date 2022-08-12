package com.banyan.output_stream;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author 暖雪
 * @version 1.8
 * 演示FileOutputStream 类的使用方法
 */
public class FileOutputStream_ {

    /**
     * FileOutputStream 字节输入流，将数据写入文件
     * 如果文件不存在，创建该文件,FileOutputStream 会自动创建
     * FileOutputStream 写入内容时，会覆盖原先内容
     */
    @Test
    public void wrireFile01() {

        String filePath = "d:\\javatest\\test02.txt";
        FileOutputStream fos = null;
        try {
//            fos = new FileOutputStream(filePath);
            fos = new FileOutputStream(filePath, true); // append - 如果为 true，则将字节写入文件末尾处，而不是写入文件开始处

            // 写入一个字符
            fos.write('h');

            // 写入字符串
            String str = "ello";
            byte[] bytes = str.getBytes();
            fos.write(bytes);

            // 写入截取字符串
            fos.write("hello,world\n".getBytes(), 5, 7);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
