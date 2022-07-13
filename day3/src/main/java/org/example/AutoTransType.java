/**
 * description: infocarriers  - AutoTransType <br>
 * author: mzc <br>
 * date: 2022/7/13 15:10 <br>
 * version: 1.0 <br>
 */
package org.example;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 自动拆装箱
 */
public class AutoTransType {

    /**
     * 自动装箱 - 基础款
     */
    @Test
    public void autoPacking(){
        Integer i = -128;
        Integer ia = Integer.valueOf(-128);
        System.out.println(i == ia);
    }
    /**
     * 自动装箱 - 高级款
     */
    @Test
    public void autoPacking2(){
        Integer i = 1000;
        Integer i2 = 1000;
        System.out.println(i == i2);
        Integer ia = Integer.valueOf(1000);
        System.out.println(i == ia);
    }

    /**
     * 自动拆箱 - 基础款
     */
    @Test
    public void autoUnpack(){
        Integer integer = Integer.valueOf(1);
        int i = integer;
        System.out.println(integer == i);
    }

    /**
     * 自动拆箱 - 高级款
     */
    @Test
    public void autoUnpack2(){
        Integer integer = Integer.valueOf(1000);
        int i = integer.intValue();
        System.out.println(integer == i);

        Integer integer2 = Integer.valueOf(1000);
        int i2 = integer2.intValue();

        System.out.println(i == i2);
    }

    public static void main(String[] args) {
        AutoTransType type = new AutoTransType();
        System.out.println(type instanceof Object);
        //判断一个类是否是另一个类的子类或实现类
        System.out.println(Object.class.isAssignableFrom(AutoTransType.class));
        for (int i=0;i<10;i++){
            continue;
        }
        System.out.println(AutoTransType.class.isAssignableFrom(Object.class));


    }
}
