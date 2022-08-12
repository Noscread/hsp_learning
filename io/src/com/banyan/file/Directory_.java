package com.banyan.file;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * @author 暖雪
 * @version 1.8
 * 文件夹创建删除 文件的删除
 */
public class Directory_ {

    /**
     * 判断文件是否存在，若存在则删除文件
     */
    @Test
    public void m1() {
        String filePath = "d:\\javatest\\test1.txt";
        File file = new File(filePath);
        if (file.exists()) {
            if (file.delete()) { // delete 返回boolean
                System.out.println("删除成功");
            }
            else {
                System.out.println("删除失败");
            }
        }
        else {
            System.out.println("文件不存在");
        }
    }

    /**
     * 判断文件路径是否存在，若存在则删除文件夹
     * 这是java的一个特点，路径也被当做是一种File对象，一种文件
     */
    @Test
    public void m2() {

        File file = new File("d:\\javatest\\1\\");
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("删除成功");
            } else {
                System.out.println("删除失败"); // 如果不是空文件夹会删除失败
            }
        } else {
            System.out.println("目录不存在");
        }
    }

    /**
     * 判断文件路径是否存在，若不存在创建
     * 这是java的一个特点，路径也被当做是一种File对象，一种文件
     */
    @Test
    public void m3() {

        File file = new File("d:\\javatest\\1\\2");
        if (file.exists()) {
            System.out.println("目录已存在"); //如果存在文件名和设置的路径名完全一样，会显示目录已存在
        } else {
            if (file.mkdirs()) { //mkdir() 只能创建一级目录
                //file.createNewFile(); 是创建文件的，不是文件夹
                System.out.println("目录创建成功");
            }
            else {
                System.out.println("目录创建失败"); //如果存在文件名和设置的路径名完全一样，会创建失败
            }
        }
    }
}
