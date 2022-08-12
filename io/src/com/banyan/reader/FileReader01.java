package com.banyan.reader;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author 暖雪
 * @version 1.8
 * FileReader 读取文件内容
 */
public class FileReader01 {

    /**
     *用FileReader 单个字符 读取文件内容，并打印出来
     */
    @Test
    public void readFile01() {
        String filePath = "d:\\javatest\\test01.txt";
        FileReader fr = null;
        int data = 0;
        try {
            fr =new FileReader(filePath);

            // 单字符读取
            while ((data = fr.read()) != -1) { // 如果这里是char类型的data，强转右边会造成读取死循环
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     *用FileReader 字符数组 读取文件内容，并打印出来
     */
    @Test
    public void readFile02() {
        String filePath = "d:\\javatest\\test01.txt";
        FileReader fr = null;
        int readLen = 0;
        char[] chars = new char[8];
        try {
            fr =new FileReader(filePath);

            // 单字符读取
            while ((readLen = fr.read(chars)) != -1) { // 如果这里是char类型的data，强转右边会造成读取死循环
                System.out.print(new String(chars, 0, readLen));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
