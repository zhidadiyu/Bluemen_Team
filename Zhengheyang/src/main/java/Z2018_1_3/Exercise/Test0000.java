package Z2018_1_3.Exercise;

/**

 * Project Name:test
 * File Name:Test0000.java
 * Package Name:test
 * Date:2018年1月3日下午3:09:54
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

//package test;

import java.util.Scanner;

/**
 * Description:   <br/>
 * Date:     2018年1月3日 下午3:09:54 <br/>
 * @author   Zhengheyang
 * @version
 * @see
 */
import org.apache.log4j.Logger;

public class Test0000 {
    private final static Logger LOG = Logger.getLogger(Test0000.class);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LOG.info("请输入：");
        try {
            String j = null;
            String i = scanner.next();
            if (j.equals(i)) {
                LOG.info(i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
