package chapter8;

/**
 * FileName: Coffee.java
 * Description:
 * Authors: wangbiwen<wangbiwen@xiaomi.com>
 * Date: 16-11-3
 */
public class Tea2 extends CoffeinBeverage {

    @Override
    public void brew() {
        System.out.println("Steeping the tea.");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding lemon.");
    }

}
