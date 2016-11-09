package chapter9;

import java.util.*;

/**
 * FileName: Waitress.java
 * Description:
 * Authors: wangbiwen<wangbiwen@xiaomi.com>
 * Date: 16-11-4
 */
public class Waitress {
//    PancakeHouseMenu pancakeHouseMenu;
//    DinerMenu dinerMenu;
    Menu pancakeHouseMenu;
    Menu dinerMenu;
    Menu cafeMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu, Menu cafeMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
        this.cafeMenu = cafeMenu;
    }

    public void printMenu() {
        java.util.Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        java.util.Iterator dinerIterator = dinerMenu.createIterator();
        java.util.Iterator cafeIterator = cafeMenu.createIterator();
        printMenu(pancakeIterator);
        printMenu(dinerIterator);
        printMenu(cafeIterator);
    }

    private void printMenu(java.util.Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println(menuItem.getName());
        }
    }
}
