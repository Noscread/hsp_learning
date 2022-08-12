package com.banyan.file;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * @author 暖雪
 * @version 1.8
 * 创建文件的方法
 */
public class FileCreate {
    public static void main(String[] args) {

    }

    /**
     * 方法一：new File(String pathName) 直接创建文件
     * @Test 是方便测试一小段代码，不需要写创建对象快速执行一段代码的方法
     * 原理是引入单元测试依赖jar包
     */
    @Test
    public void createFile01() {
//        String filePath = "src\\folder\\test01.txt";
//        File file = new File(filePath);
//
//        try {
//            file.createNewFile();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        File file = new File("src\\folder\\test01.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("方法一创建成功");
    }

    /**
     * 方法二：new File(File parent, String child) 根据父目录文件+子路径构建
     */
    @Test
    public void createFile02() {
        File parentFile = new File("src\\folder\\");
        String fileName = "test02.txt";
        File file = new File(parentFile, fileName);
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

//        File file = new File("src\\folder\\", "test02.txt");
//        try {
//            file.createNewFile();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        System.out.println("方法二创建成功");
    }

    /**
     * 方法三：new File(String parent, String child) 根据父目录+子路径构建，这里和二的区别在于，第一个参数是字符串
     */
    @Test
    public void createFile03() {
        File file = new File("src\\folder\\", "test03.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("方法三创建成功");
    }
}


