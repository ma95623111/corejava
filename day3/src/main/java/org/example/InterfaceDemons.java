/**
 * description: infocarriers - interface - InterfaceDemons <br>
 * author: mzc <br>
 * date: 2022/7/13 14:46 <br>
 * version: 1.0 <br>
 */
package org.example;

public interface InterfaceDemons {

    /**
     * 抽象方法，等同于下面的抽象方法
     */
    void show();
    /**
     * 抽象方法，等同于上面的抽象方法
     */
    public abstract void showTwo();

    /**
     * 接口中的具体方法
     */
    static void showThree(){
        System.out.println("showThree");
    }

    /**
     * 接口中的具体方法
     */
    default void showFour(){
        System.out.println("showFour");
    }
}
