package chapter12;

/**
 * FileName: FlockObserver.java
 * Description:
 * Authors: wangbiwen
 * Date: 16-11-24
 */
public class FlockObserver implements Observer {
    @Override
    public void update(Quackable duck) {
        duck.quack();
    }
}
