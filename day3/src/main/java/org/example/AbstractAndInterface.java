/**
 * description: infocarriers  - AbstractAndInterface <br>
 * author: mzc <br>
 * date: 2022/7/13 14:51 <br>
 * version: 1.0 <br>
 */
package org.example;

public class AbstractAndInterface {

    /**
     * 接口的实例化
     */
    public void interfaceInit(){
        InterfaceDemons interfaceDemons = new InterfaceDemons() {
            @Override
            public void show() {
                System.out.println("hahha");
            }

            @Override
            public void showTwo() {

            }
        };
    }

    public static void main(String[] args) {

    }
}
