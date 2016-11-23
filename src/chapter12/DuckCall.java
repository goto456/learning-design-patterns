package chapter12;

/**
 * FileName: DuckCall.java
 * Description:
 * Authors: wangbiwen
 * Date: 16-11-23
 */
public class DuckCall implements Quackable {
    @Override
    public void quack() {
        System.out.println("Kwak");
    }
}
