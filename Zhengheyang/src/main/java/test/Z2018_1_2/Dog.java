package test.Z2018_1_2;

/*
 熟悉理解多态应用场景，列举三个以上，格式如：
 父类：宠物类 Pet
 子类：狗类 Dog，猫类Cat；
 多态的方法（eat）：各子类的不同实现 ,狗吃骨头，猫吃鱼
 **/
/**
 * Project Name:workspace1
 * File Name:Dog.java
 * Package Name:lession180102
 * Date:2018年1月2日下午2:20:18
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

/**
 * Description: <br/>
 * Date: 2018年1月2日 下午2:20:18 <br/>
 * 
 * @author zhengheyang
 * @version
 * @see
 */
public class Dog extends Pet {
    public Dog(String age, String num) {
        setAge(age);
        setNum(num);
    }

    @Override
    public void Sat() {
        System.out.println("猫吃" + getNum() + "狗狗叫" + getAge());
    }
}
