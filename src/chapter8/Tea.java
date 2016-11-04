package chapter8;

/**
 * FileName: Coffee.java
 * Description:
 * Authors: wangbiwen<wangbiwen@xiaomi.com>
 * Date: 16-11-3
 */
public class Tea {
    public void prepareRecipe() {
        boilWater();
        steepTeaBag();
        pourInCup();
        addLemon();
    }

    public void boilWater() {
        System.out.println("Boiling water.");
    }

    public void steepTeaBag() {
        System.out.println("Steeping the tea.");
    }

    public void pourInCup() {
        System.out.println("Pouring into cup.");
    }

    public void addLemon() {
        System.out.println("Adding lemon.");
    }

}
