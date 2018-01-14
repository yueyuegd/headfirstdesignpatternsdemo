package designpatterns.facade;

/**
 * Created by zhangyue-k on 2018/1/14.
 */
public class HomeTheaterTestDriver {

    public static void main(String[] args) {
        //实例化所有组件
        Amplifier amplifier =  new Amplifier("amplifier");
        Tuner tuner = new Tuner("tuner", amplifier);
        DvdPlayer dvdPlayer = new DvdPlayer("dvdPlayer", amplifier);
        CdPlayer cdPlayer = new CdPlayer("cdPlayer", amplifier);
        Projector projector = new Projector("projector", dvdPlayer);
        TheaterLights theaterLights = new TheaterLights("theater lights");
        Screen screen = new Screen("screen");
        PopcornPopper popcornPopper = new PopcornPopper("popcornpopper");
        HometheaterFacade hometheaterFacade = new HometheaterFacade(
                amplifier,tuner,dvdPlayer,cdPlayer,projector,theaterLights,screen,popcornPopper
        );
        hometheaterFacade.watchMovie("Raiderof the Lost Ark");
        hometheaterFacade.endMovie();
    }
}
