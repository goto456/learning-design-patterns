package Singleton;

/**
 * 《Effective Java》中推荐的写法，静态内部类实现
 * Created by goto456 on 2018/11/4.
 */
public class Singleton2 {
    private Singleton2() {

    }

    private static class SingletonHolder {
        private static final Singleton2 SINGLETON = new Singleton2();
    }

    public static Singleton2 getUniqueInstance() {
        return SingletonHolder.SINGLETON;
    }
}
