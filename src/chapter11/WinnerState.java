package chapter11;

/**
 * FileName: WinnerState.java
 * Description:
 * Authors: wangbiwen<wangbiwen@xiaomi.com>
 * Date: 16-11-17
 */
public class WinnerState implements State {
    private GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Error.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Error.");
    }

    @Override
    public void turnCrank() {
        System.out.println("Error.");
    }

    @Override
    public void dispense() {
        System.out.println("You are a winner, you will get two gumballs.");
        gumballMachine.releaseBall();
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0) {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        } else {
            System.out.println("Oops, out of gumballs.");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
}
