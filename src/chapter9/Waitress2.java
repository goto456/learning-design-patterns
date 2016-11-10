package chapter9;

/**
 * FileName: Waitress2.java
 * Description:
 * Authors: wangbiwen<wangbiwen@xiaomi.com>
 * Date: 16-11-10
 */
public class Waitress2 {
    MenuComponent allMenus;

    public Waitress2(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }
}
