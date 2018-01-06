/**
 * Project Name:java
 * File Name:wenjian.java
 * Package Name:test5
 * Date:2018��1��6������4:04:42
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package test5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Description: <br/>
 * Date: 2018��1��6�� ����4:04:42 <br/>
 * 
 * @author YangKui
 * @version
 * @see
 */
public class wenjian {

    public static void main(String[] args) /* throws IOException */{
        String path = "F:\\jishiben\\vipcard.txt";// �ļ�·��
        File file = new File(path);// ֻ�ܶ����ļ�·��
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);
        } catch (FileNotFoundException e) {

            // Auto-generated catch block
            e.printStackTrace();

        }// ��ȡ�ļ�����
        byte[] b = new byte[1024];// �Ѷ�ȡ�ļ������ݴ洢���������У�ÿ�ζ�ȡ������1024���ֽ�
        int len = 0;
        try {
            len = fis.read(b);
        } catch (IOException e) {

            // Auto-generated catch block
            e.printStackTrace();

        }// ��ȡ�ֽ�1024
        while (len != -1) {// ѭ����ȡ
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
