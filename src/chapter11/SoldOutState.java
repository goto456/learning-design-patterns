package chapter11;

/**
 * FileName: SoldOutState.java
 * Description:
 * Authors: wangbiwen<wangbiwen@xiaomi.com>
 * Date: 16-11-17
 */
public class SoldOutState implements State {
    private GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
    @Override
    public void insertQuarter() {
        System.out.println("No gumball.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("No gumball.");
    }

    @Override
    public void turnCrank() {
        System.out.println("No gumball.");
    }

    @Override
    public void dispense() {
        System.out.println("No gumball.");
    }
}
