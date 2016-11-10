package chapter9;

/**
 * FileName: MenuTestDrive2.java
 * Description:
 * Authors: wangbiwen<wangbiwen@xiaomi.com>
 * Date: 16-11-10
 */
public class MenuTestDrive2 {
    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new MenuClass("Pancake House Menu", "Breakfast");
        MenuComponent dinerMenu = new MenuClass("Diner Menu", "Lunch");
        MenuComponent cafeMenu = new MenuClass("Cafe Menu", "Dinner");
        MenuComponent dessertMenu = new MenuClass("Dessert Menu", "Dessert of course");

        MenuComponent allMenus = new MenuClass("All Menus", "All menus combined");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        dinerMenu.add(new MenuItem("Pasta", "Spaghetti with Marinara Sauce, and a slice.", true, 3.89));
        dinerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem("Apple Pie", "Apple pie with a flakey crust...", true, 1.59));

        Waitress2 waitress = new Waitress2(allMenus);
        waitress.printMenu();
    }
}
