package test.Z2018_1_3.Exercise.abnormal;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入:");
        try {
            // short val = scanner.nextShort();
            String str = scanner.next();
            // System.out.println(val);
            int len = str.length();
            if (len < 3) {
                throw new Exception("输入有误");
            }
        } catch (Exception e) {
            System.out.println("请输入正确的数据");
            e.printStackTrace();
        }
        scanner.close();
    }
}