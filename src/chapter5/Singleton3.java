package chapter5;

/**
 * FileName: Singleton.java
 * Description:
 * Authors: wangbiwen<wangbiwen@xiaomi.com>
 * Date: 16-10-24
 */
public class Singleton3 {
    private static Singleton3 uniqueInstance = new Singleton3();

    private Singleton3() {
    }

    public static Singleton3 getUniqueInstance() {
        return uniqueInstance;
    }
}
