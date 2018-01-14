package designpatterns.command;

/**
 * Created by zhangyue-k on 2018/1/14.
 * 起居室吊扇
 */
public class CellingFan {
    String location = "";
    int level;
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    int speed;

    public CellingFan(String location) {
        this.location = location;
    }

    public void high() {
        level = HIGH;
        System.out.println(this.location + " celling fan is on high");
    }

    public void medium() {
        level = MEDIUM;
        System.out.println(this.location + " celling fan is on medium");
    }

    public void low() {
        level = LOW;
        System.out.println(this.location + " celling fan is on low");
    }

    public void off() {
        level = 0;
        System.out.println(this.location + " celling fan is off");
    }

    public int getSpeed() {
        return level;
    }
}
