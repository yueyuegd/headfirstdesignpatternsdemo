package designpatterns.facade;

/**
 * Created by zhangyue-k on 2018/1/14.
 * 扩音器
 */
public class Amplifier {
    String description;
    Tuner tuner;
    DvdPlayer dvdPlayer;
    CdPlayer cdPlayer;

    public Amplifier(String description) {
        this.description = description;
    }
    public void on() {
        System.out.println(this.description + " on");
    }
    public void off() {
        System.out.println(this.description + " off");
    }
    public void setStereoSound() {
        System.out.println(this.description + " stereo mode on");
    }
    public void setVolume(int level) {
        System.out.println(this.description + " setting volume to" + level);
    }
    public void setTuner(Tuner tuner) {
        this.tuner = tuner;
    }
    public void setDvdPlayer(DvdPlayer dvdPlayer) {
        this.dvdPlayer = dvdPlayer;
    }
    public void setCdPlayer(CdPlayer cdPlayer) {
        this.cdPlayer = cdPlayer;
    }
    @Override
    public String toString() {
        return description;
    }
}
