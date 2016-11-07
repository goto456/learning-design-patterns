package chapter9;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * FileName: PancakeHouseMenu.java
 * Description:
 * Authors: wangbiwen<wangbiwen@xiaomi.com>
 * Date: 16-11-4
 */
public class DinerMenu {

    private static final int MAX_ITEMS = 6;
    private int numberOfItems = 0;
    private MenuItem[] menuItems;


    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("K&B's Pancake Breakfast", "Pancakes with fried eggs, sausage", true, 2.99);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.out.println("ERROR");
        }
        menuItems[numberOfItems++] = menuItem;
    }

    //    public MenuItem[] getMenuItems() {
//        return menuItems;
//    }
    public chapter9.Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
