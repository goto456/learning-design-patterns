package iterator;

import chapter9.Iterator;

import java.util.ArrayList;

/**
 * Authors: wangbiwen
 * Date: 11/5/18
 */
public class IteratorClient {
    public static void main(String[] args) {
        Aggregate aggregate = new ConcreteAggregate();
        java.util.Iterator<Integer> iterator = aggregate.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
