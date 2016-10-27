package chapter4;

/**
 * FileName: PizzaTestDrive.java
 * Description:
 * Authors: wangbiwen<wangbiwen@xiaomi.com>
 * Date: 16-10-21
 */
public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

        Pizza pizza = nyPizzaStore.orderPizza("cheese");
        System.out.println("Ordered a " + pizza.getName() + "\n");
//
//        pizza = chicagoPizzaStore.orderPizza("cheese");
//        System.out.println("Ordered a " + pizza.getName() + "\n");

    }
}
