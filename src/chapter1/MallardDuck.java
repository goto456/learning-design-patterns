package chapter1;

/**
 * FileName: MallardDuck.java
 * Description:
 * Authors: wangbiwen<wangbiwen@xiaomi.com>
 * Date: 16-10-13
 */
public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlayWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm real Mallard duck.");
    }
}
