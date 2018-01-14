package designpatterns.command;

/**
 * Created by zhangyue-k on 2018/1/14.
 * 起居室电灯打开命令
 */
public class LivingroomLightOnCommand implements Command{

    Light light;

    public LivingroomLightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
