package chapter9;

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

    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        java.util.Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        java.util.Iterator dinerIterator = dinerMenu.createIterator();
        printMenu(pancakeIterator);
        printMenu(dinerIterator);
    }

    private void printMenu(java.util.Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println(menuItem.getName());
        }
    }
}
