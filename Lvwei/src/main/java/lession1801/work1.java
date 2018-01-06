/**
 * Project Name:dt59mehomework
 * File Name:work1.java
 * Package Name:lession1.lession180104
 * Date:2018年1月4日下午6:50:30
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package lession1.lession180104;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月4日 下午2:05:18 <br/>
 * 
 * @author lvwei
 * @version
 * @see
 */
public class work1 {
    private final static Logger LOG = Logger.getLogger(work1.class);

    public static void main(String[] args) {
        /**
         * 1.<br/>
         * 可先编译一个字符数组<br/>
         * 然后用String类型输出一个组字符串<br/>
         */
        char[] ary = new char[] { 'a', 'b', 'c' };
        String str = new String(ary);
        LOG.info(str);

        String str1 = new String(ary, 0, 3);
        LOG.info(str1);

        /**
         * 2.<br>
         * String a = "axc".substring(int x, int y );
         * 从“abc”字符串的第‘x’位（从0开始）开始输出（y-x）个<br>
         * 'x'代表字符串中所在位置（从0开始）<br>
         * 'y'代表要输出的最后一位所在字符串长度（从1开始）<br>
         */
        String a = "axc".substring(1, 3);
        String b = "axc".substring(0, 2);
        LOG.info(a);
        LOG.info(b);

        /**
         * 3.<br>
         * b.concat("srt");是指在字符串b的结尾连接一个新的String类型的字符串
         */
        String b1 = "abc";
        b1 = b1.concat("srt");
        LOG.info(b);

        /**
         * 4.<br>
         * replace(char oldChar, char newChar),将字符串中出现的一种字符换另一种新的字符<br>
         */
        String b2 = "hello";
        b2 = b2.replace('l', 'n');
        LOG.info(b2);

        /**
         * 5.<br>
         * replace(CharSequence target, CharSequence replacement)<br>
         * 将需要修改的一组字符串替换成另一组字符串
         */
        b2 = b2.replace("he", "hello");
        LOG.info(b2);
    }
}
