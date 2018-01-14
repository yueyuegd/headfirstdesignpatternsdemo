package designpatterns.command;

/**
 * Created by zhangyue-k on 2018/1/14.
 * 音响
 */
public class Stereo {

    String location;

    public Stereo(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(this.location + " stereo is on");
    }

    public void off() {
        System.out.println(this.location + " stereo is off");
    }

    public void setCD() {
        System.out.println(this.location + " stere is set for CD input");
    }

    public void setDVD() {
        System.out.println(this.location + " stereo is set for DVD input");
    }

    public void setRadio() {
        System.out.println(this.location + " stereo is set for radio");
    }

    public void setVolume(int volume) {
        System.out.println(this.location + " Stereo volume set to " + volume);
    }
}
