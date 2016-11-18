package chapter11;

/**
 * FileName: GumballMonitor.java
 * Description:
 * Authors: wangbiwen<wangbiwen@xiaomi.com>
 * Date: 16-11-18
 */
public class GumballMonitor {
    GumballMachine gumballMachine;

    public GumballMonitor(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void report() {
        System.out.println("Gumball machine: " + gumballMachine.getLocation());
        System.out.println("Gumball machine has: " + gumballMachine.getCount() + " gumballs.");
        System.out.println("Current state: " + gumballMachine.getState());
    }
}
