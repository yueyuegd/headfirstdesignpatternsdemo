package designpatterns.command;

/**
 * Created by zhangyue-k on 2018/1/14.
 * 车库门打开的命令
 */
public class GarageDoorOnCommand implements Command{

    GarageDoor garageDoor;

    public GarageDoorOnCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }
}
