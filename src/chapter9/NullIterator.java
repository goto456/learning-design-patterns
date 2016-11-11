package chapter9;

import java.util.*;

/**
 * FileName: NullIterator.java
 * Description:
 * Authors: wangbiwen<wangbiwen@xiaomi.com>
 * Date: 16-11-11
 */
public class NullIterator implements java.util.Iterator {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
