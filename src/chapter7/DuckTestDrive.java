package chapter7;

/**
 * FileName: DuckTestDrive.java
 * Description:
 * Authors: wangbiwen<wangbiwen@xiaomi.com>
 * Date: 16-11-1
 */
public class DuckTestDrive {
    public static void main(String[] args) {
        WildTrukey turkey = new WildTrukey();
        Duck turkeyAdapter = new TrukeyAdapter(turkey);

        System.out.println("The turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("The TurkeyAdapter says...");
        turkeyAdapter.quack();
        turkeyAdapter.fly();
    }
}
