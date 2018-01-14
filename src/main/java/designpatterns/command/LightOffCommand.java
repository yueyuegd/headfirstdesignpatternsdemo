package designpatterns.command;

/**
 * Created by zhangyue-k on 2018/1/14.
 * 创建吗一个关闭电灯的命令
 */
public class LightOffCommand implements Command{
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();

    }

    @Override
    public void undo() {
        light.on();
    }
}
