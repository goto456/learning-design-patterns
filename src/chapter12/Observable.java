package chapter12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * FileName: Observable.java
 * Description:
 * Authors: wangbiwen
 * Date: 16-11-24
 */
public class Observable implements QuackObservable {
    private List<Observer> observers = new ArrayList<Observer>();
    private Quackable duck;

    public Observable(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        Iterator iterator = observers.iterator();
        while (iterator.hasNext()) {
            Observer observer = (Observer) iterator.next();
            observer.update(duck);
        }
    }
}
