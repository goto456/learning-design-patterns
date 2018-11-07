package iterator;

import java.util.Iterator;

/**
 * Authors: wangbiwen
 * Date: 11/5/18
 */
public class ConcreteIteractor<Item> implements Iterator {
    private Item[] items;
    private int position = 0;

    public ConcreteIteractor(Item[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.length;
    }

    @Override
    public Object next() {
        return items[position++];
    }
}
