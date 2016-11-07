package chapter9;

import java.util.ArrayList;

/**
 * FileName: PancakeHouseMenuIterator.java
 * Description:
 * Authors: wangbiwen<wangbiwen@xiaomi.com>
 * Date: 16-11-4
 */
public class PancakeHouseMenuIterator implements Iterator {
    private ArrayList menuItems;
    private int position;

    public PancakeHouseMenuIterator(ArrayList menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if (position >= menuItems.size() || menuItems.get(position) == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        return menuItems.get(position++);
    }
}
