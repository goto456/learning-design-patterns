package chapter12;

/**
 * FileName: BeatModelInterface.java
 * Description:
 * Authors: wangbiwen
 * Date: 16-11-24
 */
public interface BeatModelInterface {
    public void  initialize();

    public void on();

    public void off();

    public void setBPM(int bpm);

    public int getBPM();

    public void registerObserver(BeatObserver observer);

    public void removeObserver(BeatObserver observer);

    public void registerObserver(BPMObserver observer);

    public void removeObserver(BPMObserver observer);
}
