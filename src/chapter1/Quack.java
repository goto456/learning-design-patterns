package chapter1;

/**
 * FileName: Quack.java
 * Description:
 * Authors: wangbiwen<wangbiwen@xiaomi.com>
 * Date: 16-10-13
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack.");
    }
}
