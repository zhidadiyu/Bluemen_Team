package test.Z2018_1_2;

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
public class TestPet {
    public static void main(String[] args) {
        Pet pet = new Dog("汪汪", "小鱼");
        Pet pet0 = new Cat("鱼", "汪");
        if (pet instanceof Dog) {
            Dog dog = (Dog) pet;
            dog.Sat();
        }
        if (pet0 instanceof Cat) {
            Cat cat = (Cat) pet0;
            cat.Sat();
        }
    }
}