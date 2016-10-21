package chapter1;

/**
 * FileName: FlayWithWings.java
 * Description:
 * Authors: wangbiwen<wangbiwen@xiaomi.com>
 * Date: 16-10-13
 */
public class FlayWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I am flying.");
    }
}
