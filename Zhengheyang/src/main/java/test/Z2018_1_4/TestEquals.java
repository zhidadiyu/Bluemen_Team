package test.Z2018_1_4;

/**
 * equals 方法; equals方法是用来比较“地址”的; indexOf定位字符;
 */

public class TestEquals {

    public static void main(String[] args) {
        String s1 = "ABCDEFJHMNOP";
        String s2 = "a bb c";
        // char c1 = str1.charAT(3);
        System.out.println("s1.equals(3)" + s1.equals(3));
        /**
         * equals方法对于字符串来说是比较内容的，而对于非字符串来说是比较 其指向的对象是否相同的。
         * 请问包老师这个比较字符串的为什么为ture;
         */
        /*---------------------------indexOf定位字符-----------------------------------------------*/
        System.out.println("s1.indexOf()" + s1.indexOf("N"));
        // 注释：indexOf() 方法对大小写敏感！
        // 注释：如果要检索的字符串值没有出现，则该方法返回 -1。
        // 定位字符串角标在哪个位置,N=9;
        /*---------------------------equals方法比较-----------------------------------------------*/
        int a = 3;
        int b = 4;
        int c = 4;
        System.out.println(a == b);
        // System.out.println(a.equals(c));
        // equals 不能用来比较基本类型的比较;
        String i1 = "123";
        String i2 = "123";
        String i3 = "abc";
        String i4 = new String("123");
        String i5 = new String("123");
        String i6 = new String("abc");
        /**
         * 同类型输出值并比较;
         */
        System.out.println(s1 == s2);// flase;
        System.out.println("第二个比较为true:" + i1.equals(i2));// equals方法,true;
        System.out.println("第三个比较为flase:" + i4.equals(i6));
        System.out.println("第四个比较为ture:" + i4.equals(i5));
        /*------------------------对象比较字符串-------------------------------*/
        System.out.println(i1 == i4);// flase为什么这个比较结果为flase;
        System.out.println(i1.equals(i4));// 为什么字符串比较对象为ture;
    }

}
