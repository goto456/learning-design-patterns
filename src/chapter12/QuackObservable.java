package chapter12;

/**
 * FileName: QuackObservable.java
 * Description:
 * Authors: wangbiwen
 * Date: 16-11-23
 */
public interface QuackObservable {
    public void registerObserver(Observer observer);
    public void notifyObservers();
}
