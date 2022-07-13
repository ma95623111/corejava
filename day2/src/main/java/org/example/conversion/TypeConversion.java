/**
 * description: infocarriers  - TypeConversion <br>
 * author: mzc <br>
 * date: 2022/7/12 14:48 <br>
 * version: 1.0 <br>
 */
package org.example.conversion;

import org.junit.Test;

public class TypeConversion  {

    /**
     * 以下是自动转换演示代码
     */
    @Test
    protected void integerAutoConversion(){
        byte b = 1;
        short s = b;
        int i = s;
        long l = i;
        System.out.println(l);
    }
    @Test
    public void decimalAutoConversion(){
        float f = 1f;
        double d = f;
        System.out.println(d);
    }
    @Test
    public void typeAutoConversion(){
        SubClass subClass = new SubClass();
        ParentClass parentClass = subClass;

    }
    @Test
    public void interfaceAutoConversion(){
        SubInterface subInterface = new SubInterface();
        ParentInterface parentInterface = subInterface;
    }
    /**
     * 以下是强制转换演示代码
     */
    @Test
    public void integerForceConversion(){
        int i = 1;
        short s = (short) i;
        System.out.println(s);
    }
    @Test
    public void decimalForceConversion(){
        double d = 1.2;
        float f = (float) d;
        System.out.println(d);
    }
    @Test
    public void typeForceConversion(){
        ParentClass parentClass = new ParentClass();
        SubClass subClass = (SubClass) parentClass;

    }
    @Test
    public void interfaceForceConversion(){
//        ParentInterface parentInterface = new ParentInterface() {
//            @Override
//            public String toString() {
//                return super.toString();
//            }
//        };
//        SubInterface subInterface = (SubInterface) parentInterface;
        System.out.println(1<<31);
    }


    /**
     * 以下是运算自动转换
     */
    @Test
    public void operationAutoConversion(){
        int i = 1;
        long l = i+1;
        System.out.println(l);

        int i1 = (1<<31)-1;//2147483647
        long l1 = (i1+1);
        System.out.println(l1);//-2147483648

        long l2 = i1 + 1l;// = 2147483647l+ 1l

        System.out.println(l2);//2147483648

    }
}
