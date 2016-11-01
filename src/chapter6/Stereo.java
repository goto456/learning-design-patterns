package chapter6;

/**
 * FileName: Stereo.java
 * Description:
 * Authors: wangbiwen<wangbiwen@xiaomi.com>
 * Date: 16-10-26
 */
public class Stereo {
    public void on() {
        System.out.println("Stereo is on.");
    }

    public void off() {
        System.out.println("Stereo is off.");
    }

    public void setCd() {
        System.out.println("Stereo is setting CD.");
    }

    public void setDvd() {
        System.out.println("Stereo is setting DVD.");
    }

    public void setRadio() {
        System.out.println("Stereo is setting radio.");
    }

    public void setVolume(int volume) {
        System.out.println("Stereo is setting volume at " + volume + ".");
    }
}
