package test.Z2018_1_4;

/**
 * 截取字符串；
 */
public class TestSubstring {

    public String str = "1234ABCD";

    public int i = 3;

    /*--------------------取字符串的前i个字符-------------------------------*/
    public String getSubimage() {

        str = str.substring(0, i);
        return str;
    }

    /*--------------------去掉字符串的前i个字符-------------------------------*/
    public String getRemove() {

        // str = str.remove(0,i);
        return str;
    }

    /*--------------------从右边开始取i个字符-------------------------------*/

    public String getSubString() {
        str = str.substring(0, str.length() - i);
        return str;
    }

    /*--------------------比较字符串----------------------------------------*/

    public void getEquals() {
        System.out.println(str.equals(3));
    }

    /*--------------------定位字符----------------------------------------*/

    public void getIndex() {
        System.out.println(str.indexOf("C"));
    }

    /*--------------------替换字符----------------------------------------*/
    public String getReplace() {
        str = str.replace("1234", "abcd");
        return str;
    }
    /*--------------------删除字符----------------------------------------*/
}
