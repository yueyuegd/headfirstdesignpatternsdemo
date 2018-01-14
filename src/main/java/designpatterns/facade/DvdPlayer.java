package designpatterns.facade;

/**
 * Created by zhangyue-k on 2018/1/14.
 */
public class DvdPlayer {
    String description;
    int currentTrack;
    Amplifier amplifier;
    String movie;

    public DvdPlayer(String description, Amplifier amplifier) {
        this.description = description;
        this.amplifier = amplifier;
    }

    public void on() {
        System.out.println(this.description + " on");
    }

    public void off() {
        System.out.println(this.description + " off");
    }

    public void eject() {
        movie = null;
        System.out.println(this.description + " eject");
    }

    public void play(String movie) {
        this.movie = movie;
        currentTrack = 0;
        System.out.println(this.description + " playing " + movie);
    }

    public void play(int track) {
        if(movie == null) {
            System.out.println(this.description + " can't play track  " + track + " no dvd inserted");
        }else {
            currentTrack = track;
            System.out.println(this.description + " playing track " + currentTrack + " of " + movie);
        }
    }

    public void stop() {
        currentTrack = 0;
        System.out.println(description + " stopped \"" + movie + "\"");
    }

    public void pause() {
        System.out.println(description + " paused \"" + movie + "\"");
    }

    public void setTwoChannelAudio() {
        System.out.println(description + " set two channel audio");
    }

    public void setSurroundAudio() {
        System.out.println(description + " set surround audio");
    }

    @Override
    public String toString() {
        return description;
    }
}



