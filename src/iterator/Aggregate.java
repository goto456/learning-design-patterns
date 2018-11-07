package iterator;

import java.util.Iterator;

/**
 * Authors: wangbiwen
 * Date: 11/5/18
 */
public interface Aggregate {
    Iterator createIterator();
}

class ConcreteAggregate implements Aggregate {
    private Integer[] items;

    public ConcreteAggregate() {
        items = new Integer[10];
        for (int i = 0; i < items.length; i++) {
            items[i] = i;
        }
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIteractor(items);
    }
}

