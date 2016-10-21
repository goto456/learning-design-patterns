package chapter1;

/**
 * FileName: DuckCall.java
 * Description:
 * Authors: wangbiwen<wangbiwen@xiaomi.com>
 * Date: 16-10-14
 */
public class DuckCall {
    private QuackBehavior quackBehavior;

    public DuckCall(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void performQuack() {
       quackBehavior.quack();
    }

    public static void main(String[] args) {
        DuckCall duckCall = new DuckCall(new Quack());
        duckCall.performQuack();
    }
}
