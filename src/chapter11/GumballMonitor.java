package chapter11;

import java.rmi.RemoteException;

/**
 * FileName: GumballMonitor.java
 * Description:
 * Authors: wangbiwen<wangbiwen@xiaomi.com>
 * Date: 16-11-18
 */
public class GumballMonitor {
    GumballMachineRemote gumballMachine;

    public GumballMonitor(GumballMachineRemote gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void report() {
        try {
            System.out.println("Gumball machine: " + gumballMachine.getLocation());
            System.out.println("Gumball machine has: " + gumballMachine.getCount() + " gumballs.");
            System.out.println("Current state: " + gumballMachine.getState());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
