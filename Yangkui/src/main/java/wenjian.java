/**
 * Project Name:java
 * File Name:wenjian.java
 * Package Name:test5
 * Date:2018年1月6日下午4:04:42
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package test5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Description: <br/>
 * Date: 2018年1月6日 下午4:04:42 <br/>
 * 
 * @author YangKui
 * @version
 * @see
 */
public class wenjian {

    public static void main(String[] args) /* throws IOException */{
        String path = "F:\\jishiben\\vipcard.txt";// 文件路径
        File file = new File(path);// 只能读到文件路径
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);
        } catch (FileNotFoundException e) {

            // Auto-generated catch block
            e.printStackTrace();

        }// 读取文件内容
        byte[] b = new byte[1024];// 把读取文件的内容存储读到数组中，每次读取数组中1024个字节
        int len = 0;
        try {
            len = fis.read(b);
        } catch (IOException e) {

            // Auto-generated catch block
            e.printStackTrace();

        }// 读取字节1024
        while (len != -1) {// 循环读取
            String str = new String(b, 0, len);
            System.out.print( str);
            try {
                len = fis.read(b);
            } catch (IOException e) {

                // Auto-generated catch block
                e.printStackTrace();

            }
        }
        try {
            if (fis != null) {
                fis.close();
            }
        } catch (IOException e) {

            // Auto-generated catch block
            e.printStackTrace();

        }
    }

}
