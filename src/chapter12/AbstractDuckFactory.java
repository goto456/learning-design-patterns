package chapter12;

/**
 * FileName: AbstractDuckFactory.java
 * Description:
 * Authors: wangbiwen
 * Date: 16-11-23
 */
public abstract class AbstractDuckFactory {
    public abstract Quackable createMallardDuck();
    public abstract Quackable createRedheadDuck();
    public abstract Quackable createDuckCall();
    public abstract Quackable createRubberDuck();
    public abstract Quackable createGooseDuck();
}
