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
        File file = new File("src\\folder\\test01.txt");

        System.out.println("文件名 " + file.getName());
        System.out.println("绝对路径 " + file.getAbsolutePath());
        System.out.println("文件父目录 " + file.getParent());
        System.out.println("文件大小（字节） " + file.length());
    }
}
