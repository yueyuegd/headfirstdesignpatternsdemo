package designpatterns.command;

/**
 * Created by zhangyue-k on 2018/1/14.
 * 产商提供的电灯
 */
public class Light {
    String location = "";

    public Light() {
    }

    public Light(String location) {
        this.location = location;
    }
    public void on() {
        System.out.println("Light is on");
    }
    public void off() {
        System.out.println("Light is off");
    }
}
