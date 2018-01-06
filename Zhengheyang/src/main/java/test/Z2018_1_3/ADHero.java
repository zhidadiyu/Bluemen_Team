package test.Z2018_1_3;

/**
 * 设计一类英雄，能够进行物理攻击， 类ADHero; 继承了Hero类，所以继承了name,hp,armor等属性； 实现某个接口，就相当于承诺了某种约定
 * 所以，实现了AD这个接口，就必须提供AD接口中声明的方法physicAttack() 实现在语法上使用关键字 implements;
 */
public class ADHero implements AD {
    @Override
    public void physicAttack() {
        System.out.println("进行物理攻击");
    }
}