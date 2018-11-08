package strategy;

import java.util.ArrayList;

/**
 * Authors: wangbiwen
 * Date: 11/5/18
 */
public class Duck {
    QuackBehavior behavior;

    public void setBehavior(QuackBehavior behavior) {
        this.behavior = behavior;
    }

    public void performQuack() {
        if (behavior != null) {
            behavior.quack();
        }
    }

    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.setBehavior(new Quack());
        duck.performQuack();

        duck.setBehavior(new Squeak());
        duck.performQuack();
    }
}
