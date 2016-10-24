package chapter2;

/**
 * FileName: Subject.java
 * Description:
 * Authors: wangbiwen<wangbiwen@xiaomi.com>
 * Date: 16-10-17
 */
public interface Subject {
    public void registerObserver(Observer ob);

    public void removeObserver(Observer ob);

    public void notifyObservers();
}
