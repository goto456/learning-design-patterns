package Singleton;

/**
 * Authors: wangbiwen
 * Date: 11/2/18
 */
public class Singleton {
    private volatile static Singleton uniqueInstance;

    private Singleton() {

    }

    public static Singleton getUniqueInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
