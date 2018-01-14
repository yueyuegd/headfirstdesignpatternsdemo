package designpatterns.command;

/**
 * Created by zhangyue-k on 2018/1/14.
 * 遥控器测试
 */
public class RemoteLoader {

    public static void main(String[] args) {
        RemoteControll remoteControll = new RemoteControll();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CellingFan cellingFan = new CellingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor();
        Stereo stereo = new Stereo("Living Room");

        LightOnCommand livingRoomLightOn =
                new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff =
                new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn =
                new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff =
                new LightOffCommand(kitchenLight);

        CellingFanOnCommand ceilingFanOn =
                new CellingFanOnCommand(cellingFan);
        CellingFanOffCommand ceilingFanOff =
                new CellingFanOffCommand(cellingFan);

        GarageDoorOnCommand garageDoorUp =
                new GarageDoorOnCommand(garageDoor);
        GarageDoorDownCommand garageDoorDown =
                new GarageDoorDownCommand(garageDoor);

        StereoOnWithCDCommand stereoOnWithCD =
                new StereoOnWithCDCommand(stereo);
        StereoOffCommand  stereoOff =
                new StereoOffCommand(stereo);

        remoteControll.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControll.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControll.setCommand(2, ceilingFanOn, ceilingFanOff);
        remoteControll.setCommand(3, stereoOnWithCD, stereoOff);

        System.out.println(remoteControll);

        remoteControll.onButtonWasPushed(0);
        remoteControll.offButtonWasPushed(0);
        remoteControll.onButtonWasPushed(1);
        remoteControll.offButtonWasPushed(1);
        remoteControll.onButtonWasPushed(2);
        remoteControll.offButtonWasPushed(2);
        remoteControll.onButtonWasPushed(3);
        remoteControll.offButtonWasPushed(3);

    }
}
