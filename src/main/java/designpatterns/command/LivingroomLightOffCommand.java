package designpatterns.command;

/**
 * Created by zhangyue-k on 2018/1/14.
 * 起居室电灯关闭命令
 */
public class LivingroomLightOffCommand implements Command {
    Light light;

    public LivingroomLightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {

    }
}
