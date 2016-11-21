package chapter11;

/**
 * FileName: NoQuarterState.java
 * Description:
 * Authors: wangbiwen<wangbiwen@xiaomi.com>
 * Date: 16-11-17
 */
public class NoQuarterState implements State {
    private transient GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You insert a quarter.");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You donot insert a quarter.");
    }

    @Override
    public void turnCrank() {
        System.out.println("You donot insert a quarter.");
    }

    @Override
    public void dispense() {
        System.out.println("You need to pay first.");
    }
}
