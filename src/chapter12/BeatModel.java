package chapter12;

import javax.sound.midi.MetaEventListener;
import javax.sound.midi.MetaMessage;
import javax.sound.midi.Sequencer;
import java.util.ArrayList;
import java.util.List;

/**
 * FileName: BeatModel.java
 * Description:
 * Authors: wangbiwen
 * Date: 16-11-24
 */
public class BeatModel implements BeatModelInterface, MetaEventListener {
    Sequencer sequencer;
    List beatObservers = new ArrayList();
    List bpmObservers = new ArrayList();
    int bpm = 90;

    @Override
    public void initialize() {
        setUpMidi();
        buildTrackAndStart();
    }

    @Override
    public void on() {
        sequencer.start();
        setBPM(90);
    }

    @Override
    public void off() {
        setBPM(0);
        sequencer.stop();
    }

    @Override
    public void setBPM(int bpm) {
        this.bpm = bpm;
        sequencer.setTempoInBPM(getBPM());
        notifyBPMObservers();
    }

    @Override
    public int getBPM() {
        return bpm;
    }

    public void beatEvent() {
        notifyBeatObservers();
    }

    @Override
    public void registerObserver(BeatObserver observer) {

    }

    @Override
    public void removeObserver(BeatObserver observer) {

    }

    @Override
    public void registerObserver(BPMObserver observer) {

    }

    @Override
    public void removeObserver(BPMObserver observer) {

    }

    @Override
    public void meta(MetaMessage meta) {

    }
}
