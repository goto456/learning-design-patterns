package strategy;

/**
 * Authors: wangbiwen
 * Date: 11/5/18
 */
public interface QuackBehavior {
    void quack();
}

class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Quack!");
    }
}

class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Squeak!");
    }
}
