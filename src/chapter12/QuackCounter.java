package chapter12;

/**
 * FileName: QuackCounter.java
 * Description:
 * Authors: wangbiwen
 * Date: 16-11-23
 */
public class QuackCounter implements Quackable {
    private Quackable duck;
    private static int numberOfQuacks;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        numberOfQuacks++;
    }

    public static int getQuacks() {
        return numberOfQuacks;
    }
}
