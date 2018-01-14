package designpatterns.command;

/**
 * Created by zhangyue-k on 2018/1/14.
 * 实现一个打开电灯的命令
 */
public class LightOnCommand implements Command{
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();

    }

    @Override
    public void undo() {
        light.off();
    }
}
