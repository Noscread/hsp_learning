package com.banyan.file;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author 暖雪
 * @version 1.8
 * 完成文件拷贝
 */
public class FileCopy {

    /**
     * 把D:\javatest\tx.jfif 文件拷贝到 D:\javatest\1\tx.jfif
     * 创建输入流，将磁盘文件写入内存
     * 边读边写
     * 创建输出流，将内存写入磁盘文件
     */
    @Test
    public void copyFile() {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream("D:\\javatest\\tx.jfif");
            fos = new FileOutputStream("D:\\javatest\\1\\tx.jfif");
            byte[] bytes = new byte[1024];
            int readLen = 0;
            while ((readLen = fis.read(bytes)) != -1) { // 边读边写
//                fos.write(bytes);  //文件大小不一致
                fos.write(bytes, 0 ,readLen);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                }
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
