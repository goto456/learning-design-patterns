package chapter6;

/**
 * FileName: Light.java
 * Description:
 * Authors: wangbiwen<wangbiwen@xiaomi.com>
 * Date: 16-10-24
 */
public class Light {
    private String name;

    public Light(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println( name + "Light is on.");
    }

    public void off() {
        System.out.println( name + "Light is off.");
    }
}
