package chapter5;

/**
 * FileName: Singleton.java
 * Description:
 * Authors: wangbiwen<wangbiwen@xiaomi.com>
 * Date: 16-10-24
 */
public class Singleton4 {
    private volatile static Singleton4 uniqueInstance;

    private Singleton4() {
    }

    public static Singleton4 getUniqueInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton4.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton4();
                }
            }
        }
        return uniqueInstance;
    }
}
