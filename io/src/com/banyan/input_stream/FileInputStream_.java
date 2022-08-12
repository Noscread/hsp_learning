package com.banyan.input_stream;

import com.banyan.file.FileInformation;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author 暖雪
 * @version 1.8
 * 演示FileInputStream 类的使用方法
 */
public class FileInputStream_ {

    /**
     * 从磁盘的文件，通过字节流读取到内存中
     * read读取一个字节，读取中文（3字节）就会产生乱码，要用字符流处理文本
     */
    @Test
    public void readFile01() {
        int readData;
        FileInputStream fis = null;
        try {
            // 创建对象，用于读取文件
             fis = new FileInputStream("d:\\javatest\\test01.txt");

            while ((readData = fis.read()) != -1) {
                System.out.print((char)readData); // 从此输入流中读取一个数据字节。-1表示结束
            }


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭文件流
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 从磁盘的文件，通过字节流（字节数组）读取到内存中
     * read读取一个字节，读取中文（3字节）就会产生乱码，要用字符流处理文本
     */
    @Test
    public void readFile02() {
        byte[] bytes = new byte[8]; // 一次读取8个字节
        int readLen = 0;
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("d:\\javatest\\test01.txt");
            while ((readLen = fis.read(bytes)) != -1) { // 如果不够，返回实际字符长度，结尾返回-1
                System.out.println(new String(bytes, 0, readLen)); // readLen最后!=bytes.length
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭文件流
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
