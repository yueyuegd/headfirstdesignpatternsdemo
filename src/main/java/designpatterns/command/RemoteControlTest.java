package designpatterns.command;

/**
 * Created by zhangyue-k on 2018/1/14.
 */
public class RemoteControlTest {

    public static void main(String[] args) {
        SimpleRemoteControl control = new SimpleRemoteControl();
        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOnCommand garageDoorOnCommand = new GarageDoorOnCommand(garageDoor);
        LightOnCommand onCommand = new LightOnCommand(light);
        control.setCommand(onCommand);
        control.buttonWasPressed();
        control.setCommand(garageDoorOnCommand);
        control.buttonWasPressed();
    }
}
