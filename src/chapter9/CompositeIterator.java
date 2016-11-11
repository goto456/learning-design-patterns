package chapter9;

import java.util.*;
import java.util.Iterator;

/**
 * FileName: CompositeIterator.java
 * Description:
 * Authors: wangbiwen<wangbiwen@xiaomi.com>
 * Date: 16-11-10
 */
public class CompositeIterator implements java.util.Iterator {
    private Stack<Iterator> stack = new Stack<>();

    public CompositeIterator(Iterator iterator) {
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if (stack.empty()) {
            return false;
        } else {
            Iterator iterator = stack.peek();
            if (iterator.hasNext()) {
                return true;
            } else {
                stack.pop();
                return hasNext();
            }
        }
    }

    @Override
    public Object next() {
        if (hasNext()) {
            Iterator iterator = stack.peek();
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            if (menuComponent instanceof MenuClass) {
                stack.push(menuComponent.createIterator());
            }
            return menuComponent;
        } else {
            return null;
        }
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
