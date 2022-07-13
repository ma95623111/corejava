/**
 * description: infocarriers  - StringDome <br>
 * author: mzc <br>
 * date: 2022/7/12 16:47 <br>
 * version: 1.0 <br>
 */
package org.example.string;

import org.junit.Test;

public class StringDemo {

    @Test
    public void demo1(){
        String s1 = "s";
        String s2 = "s";
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
    }
    @Test
    public void demo2(){
        String s1 = new String("s");
        String s2 = new String("s");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
    }

    @Test
    public void demo3(){
        String s = "s";
        String s1 = "s1";
        String s2 = s
                ;
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
    }

    @Test
    public String  demo4(){
        String s = "s";
        String s1 = "s1";
        String s2 = "s"+"1";
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        return "";
    }

    /**
     * 这个方法就是要判断传入的s是否是"java"
     * @param s
     * @return
     */
    public boolean equalsDemo(String s){
     return "java".equals(s);
    }
    @Test
    public void methodDemo(){
        String learningStr = "learningString";
        //截取字符串
        String substring = learningStr.substring(1);
        System.out.println(substring);
        String substring2 = learningStr.substring(1,3);
        System.out.println(substring2);

    }


}
