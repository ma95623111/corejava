/**
 * description: infocarriers  - KeywordAndMethod <br>
 * author: mzc <br>
 * date: 2022/7/13 15:57 <br>
 * version: 1.0 <br>
 */
package org.example;

import org.junit.Test;

public class KeywordAndMethod {

    String s ="s";
    /**
     * 判断一个对象是否是一个类的子类或者实现
     * 例如：Object是所有类的父类
     */
    @Test
    public void instanceofDesc(){
        AutoTransType type = new AutoTransType();
        System.out.println(type instanceof Object);
    }

    /**
     * 判断一个类型是否是另一个类型的子类或者实现类
     * 例如：Object是所有类的父类
     */
    @Test
    public void isAssignableFrom(){
        /*
            下面代码的意思是AutoTransType 是否是Object的子类或者实现类
         */
        System.out.println(Object.class.isAssignableFrom(AutoTransType.class));
    }

    /**
     * 跳出循环
     */
    @Test
    public void breakDesc(){
        for(int i=0;i<10;i++){
            /**
             * 当i的值为5的时候跳出循环
             */
            if(i ==5){
                break;
            }
            System.out.println(i);
        }
    }
    /**
     * 跳出本次循环
     */
    @Test
    public void continueDesc(){
        for(int i=0;i<10;i++){
            /**
             * 当i的值为5的时候跳出本次循环
             */
            if(i ==5){
                continue;
            }
            System.out.println(i);
        }
    }
}
