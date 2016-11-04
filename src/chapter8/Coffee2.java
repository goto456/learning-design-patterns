package chapter8;

/**
 * FileName: Coffee.java
 * Description:
 * Authors: wangbiwen<wangbiwen@xiaomi.com>
 * Date: 16-11-3
 */
public class Coffee2 extends CoffeinBeverage {

    @Override
    public void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Sugar and Milk.");
    }

}
