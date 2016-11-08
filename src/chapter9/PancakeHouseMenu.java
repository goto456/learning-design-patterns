package chapter9;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * FileName: PancakeHouseMenu.java
 * Description:
 * Authors: wangbiwen<wangbiwen@xiaomi.com>
 * Date: 16-11-4
 */
public class PancakeHouseMenu implements Menu {
    ArrayList menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList();

        addItem("K&B's Pancake Breakfast", "Pancakes with fried eggs, sausage", true, 2.99);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    //    public ArrayList getMenuItems() {
//        return menuItems;
//    }
    public Iterator createIterator() {
//        return new PancakeHouseMenuIterator(menuItems);
        return menuItems.iterator();
    }
}
