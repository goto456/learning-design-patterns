package chapter12;

/**
 * FileName: Quackologist.java
 * Description:
 * Authors: wangbiwen
 * Date: 16-11-24
 */
public class Quackologist implements Observer {
    @Override
    public void update(QuackObservable duck) {
        System.out.println("Quackologist: " + duck + " just quacked");
    }
}
