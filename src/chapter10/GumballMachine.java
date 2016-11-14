package chapter10;

/**
 * FileName: GumballMachine.java
 * Description:
 * Authors: wangbiwen<wangbiwen@xiaomi.com>
 * Date: 16-11-14
 */
public class GumballMachine {
    private final static int SOLD_OUT = 0;
    private final static int NO_QUARTER = 1;
    private final static int HAS_QUARTER = 1;
    private final static int SOLD = 3;

    private int state = SOLD_OUT;
    private int count = 0;

    public GumballMachine(int count) {
        this.count = count;
        if (count > 0) {
            state = NO_QUARTER;
        }
    }

    public void insertQuarter() {
        if (state == HAS_QUARTER) {
            System.out.println("You cannot insert another quarter.");
        } else if (state == NO_QUARTER) {
            state = HAS_QUARTER;
            System.out.println("You insert a quarter.");
        } else if (state == SOLD_OUT) {
            System.out.println("You cannot insert a quarter, the machine is sold out.");
        } else if (state == SOLD) {
            System.out.println("Please wait, we're already giving you a gumball.");
        }
    }

    public void ejectQuarter() {
        if (state == HAS_QUARTER) {
            state = NO_QUARTER;
            System.out.println("Quarter returned.");
        } else if (state == NO_QUARTER) {
            System.out.println("You donot insert a quarter.");
        } else if (state == SOLD_OUT) {
            System.out.println("You cannot eject, you haven't inserted a quarter yet.");
        } else if (state == SOLD) {
            System.out.println("Sorry you already turned the crank.");
        }
    }
}
