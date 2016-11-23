package chapter12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * FileName: Flock.java
 * Description:
 * Authors: wangbiwen
 * Date: 16-11-23
 */
public class Flock implements Quackable {
    private List<Quackable> quackers = new ArrayList<>();

    public void add(Quackable quacker) {
        quackers.add(quacker);
    }

    @Override
    public void quack() {
        Iterator iterator = quackers.iterator();
        while (iterator.hasNext()) {
            Quackable quacker = (Quackable) iterator.next();
            quacker.quack();
        }
    }
}
