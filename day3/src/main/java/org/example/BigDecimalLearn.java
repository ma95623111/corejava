/**
 * description: infocarriers  - BigDecimalLearn <br>
 * author: mzc <br>
 * date: 2022/7/13 09:12 <br>
 * version: 1.0 <br>
 */
package org.example;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class BigDecimalLearn {

    /**
     * 精度丢失演示
     */
    @Test
    public void precisionLoss(){
        float f = 1.0f-0.9f;
        System.out.println(f);//0.100000024
        double d = 1.0d - 0.9d;
        System.out.println(d);//0.09999999999999998

        double b= 0.1;
        System.out.println(b);
    }

    /**
     * 使用BigDecimal进行减法，
     * 该方法主要与precisionLoss进行对比
     */
    @Test
    public void BigDecimalDecrease(){
        BigDecimal decimal = new BigDecimal("1");
        BigDecimal bigDecimal = new BigDecimal("0.9");
        System.out.println(decimal.subtract(bigDecimal).toString());//0.1
    }
    /**
     * 使用BigDecimal进行减法，就不会精度丢失么？
     * 猜测：精度会丢失
     */
    @Test
    public void BigDecimalDecreasePrecisionLoss(){
        BigDecimal decimal = new BigDecimal(1);
        BigDecimal bigDecimal = new BigDecimal(0.9);
        System.out.println(decimal.subtract(bigDecimal).toString());//0.09999999999999997779553950749686919152736663818359375
    }

    /**
     * BigDecimal 比较
     */
    @Test
    public void bigDecimalCompare(){
        BigDecimal decimal = new BigDecimal("1");
        BigDecimal decimal1 = new BigDecimal("1.0");
        System.out.println(decimal.equals(decimal1));
        System.out.println(decimal.compareTo(decimal1));
    }

    /**
     * bigDecimal 无限小数时会抛出异常
     */
    @Test
    public void bigDecimalInfinite(){
        new ArrayList<>();
        BigDecimal a = new BigDecimal("1.0");
        BigDecimal b = new BigDecimal("3.0");
//        a.divide(b);
        BigDecimal divide = a.divide(b, 2, RoundingMode.HALF_UP);//解决方法 限制小数位数
        System.out.println(divide.toString());
    }

}
