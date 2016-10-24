package chapter2;

/**
 * FileName: Observer.java
 * Description:
 * Authors: wangbiwen<wangbiwen@xiaomi.com>
 * Date: 16-10-17
 */
public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
