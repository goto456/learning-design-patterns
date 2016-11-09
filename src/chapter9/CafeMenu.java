package chapter9;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/**
 * FileName: CafeMenu.java
 * Description:
 * Authors: wangbiwen<wangbiwen@xiaomi.com>
 * Date: 16-11-9
 */
public class CafeMenu implements Menu {
    private Map<String, Object> menuItems = new HashMap<String, Object>();

    public CafeMenu() {
        addItem("Veggie Burger and Air Fries", "Veggie burger on a whole wheat bun, lettuce", true, 3.99);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(menuItem.getName(), menuItem);
    }

//    public Map getMenuItems() {
//        return menuItems;
//    }

    public Iterator createIterator() {
        return menuItems.values().iterator();
    }
}
