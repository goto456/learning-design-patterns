package chapter5;

/**
 * FileName: Singleton.java
 * Description:
 * Authors: wangbiwen<wangbiwen@xiaomi.com>
 * Date: 16-10-24
 */
public class Singleton2 {
    private static Singleton2 uniqueInstance;

    private Singleton2() {
    }

    public static synchronized Singleton2 getUniqueInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton2();
        }
        return uniqueInstance;
    }
}
