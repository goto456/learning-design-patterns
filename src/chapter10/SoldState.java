package chapter10;

/**
 * FileName: SoldState.java
 * Description:
 * Authors: wangbiwen<wangbiwen@xiaomi.com>
 * Date: 16-11-17
 */
public class SoldState implements State {
    private GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
    @Override
    public void insertQuarter() {
        System.out.println("Please wait giving you a gumball.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You have already turned the crank.");
    }

    @Override
    public void turnCrank() {
        System.out.println("Don't trun twice.");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0) {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        } else {
            System.out.println("Oops, out of gumballs.");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
}
