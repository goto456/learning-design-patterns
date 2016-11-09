package chapter9;

/**
 * FileName: MenuTestDrive.java
 * Description:
 * Authors: wangbiwen<wangbiwen@xiaomi.com>
 * Date: 16-11-4
 */
public class MenuTestDrive {
    public static void main(String[] args) {
        Menu pancakeHouseMenu = new PancakeHouseMenu();
        Menu dinerMenu = new DinerMenu();
        Menu cafeMenu = new CafeMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu, cafeMenu);
        waitress.printMenu();
    }
}
