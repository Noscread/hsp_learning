package com.banyan.writer;

import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author 暖雪
 * @version 1.8
 * FileWriter 写入文件内容
 */
public class FileWriter01 {

    /**
     * FileWriter 写入内容到文件中
     */
    @Test
    public void writeFile01() {
        String filePath = "d:\\javatest\\test02.txt";
        FileWriter fw = null;

        try {
            fw = new FileWriter(filePath);
            fw.write('H'); // 字符、字符数组、裁剪字符数组、字符串、裁剪字符串
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fw != null) {
                    fw.close();
                    // 必须要关闭或者 flush，不然等于没保存
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
