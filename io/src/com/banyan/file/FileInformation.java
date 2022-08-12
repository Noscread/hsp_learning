package com.banyan.file;

import java.io.File;

/**
 * @author 暖雪
 * @version 1.8
 * 获取文件信息的方法
 */
public class FileInformation {
    public static void main(String[] args) {
        new FileInformation().info();
    }

    /**
     * 获取文件信息的方法
     */
    public void info() {
        // 先创建对象获取信息
//        File file = new File("src\\folder\\test01.txt");
        File file = new File("D:\\Github-Project-workspace\\hsp_learning\\io\\src\\folder\\test01.txt");

        System.out.println("文件名 " + file.getName());
        System.out.println("绝对路径 " + file.getAbsolutePath());
        System.out.println("文件父目录 " + file.getParent());
        // 相对路径的文件对象，无法获取
        System.out.println("文件大小（字节） " + file.length());// 文字3字节，字母数字1字节
        System.out.println("文件是否存在 " + file.exists());// T
        System.out.println("是否是一个文件 " + file.isFile());
        System.out.println("是否是一个目录 " + file.isDirectory());

    }
}
