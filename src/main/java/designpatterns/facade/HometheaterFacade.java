package designpatterns.facade;

/**
 * Created by zhangyue-k on 2018/1/14.
 * 家庭影院-外观模式
 */
public class HometheaterFacade {
    Amplifier amplifier;
    Tuner tuner;
    DvdPlayer dvdPlayer;
    CdPlayer cdPlayer;
    Projector projector;
    TheaterLights theaterLights;
    Screen screen;
    PopcornPopper popcornPopper;

    public HometheaterFacade(Amplifier amplifier, Tuner tuner, DvdPlayer dvdPlayer,
                             CdPlayer cdPlayer, Projector projector, TheaterLights theaterLights,
                             Screen screen, PopcornPopper popcornPopper) {
        this.amplifier = amplifier;
        this.tuner = tuner;
        this.dvdPlayer = dvdPlayer;
        this.cdPlayer = cdPlayer;
        this.projector = projector;
        this.theaterLights = theaterLights;
        this.screen = screen;
        this.popcornPopper = popcornPopper;
    }

    //观看电影方法
    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        popcornPopper.on();
        popcornPopper.pop();
        theaterLights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amplifier.on();
        amplifier.setDvdPlayer(dvdPlayer);
        amplifier.setStereoSound();
        amplifier.setVolume(5);
        dvdPlayer.on();
        dvdPlayer.play(movie);

    }
    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        popcornPopper.off();
        theaterLights.off();
        screen.up();
        projector.off();
        amplifier.off();
        dvdPlayer.eject();
        dvdPlayer.off();

    }

    public void listenToCd(String cdTitle) {
        System.out.println("Get ready for an audiopile experence...");
        theaterLights.on();
        amplifier.on();
        amplifier.setVolume(5);
        amplifier.setCdPlayer(cdPlayer);
        amplifier.setStereoSound();
        cdPlayer.on();
        cdPlayer.play(cdTitle);
    }

    public void endCd() {
        System.out.println("Shutting down CD...");
        amplifier.off();
        amplifier.setCdPlayer(cdPlayer);
        cdPlayer.eject();
        cdPlayer.off();
    }

    public void listenToRadio(double frequency) {
        System.out.println("Tuning in the airwaves...");
        tuner.on();
        tuner.setFrequency(frequency);
        amplifier.on();
        amplifier.setVolume(5);
        amplifier.setTuner(tuner);
    }

    public void endRadio() {
        System.out.println("Shutting down the tuner...");
        tuner.off();
        amplifier.off();
    }

}
