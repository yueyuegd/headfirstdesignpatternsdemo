package designpatterns.command;

/**
 * Created by zhangyue-k on 2018/1/14.
 * 一个简单的遥控装置：只有两个按钮和对应的插槽
 */
public class SimpleRemoteControl {
    Command command;

    public SimpleRemoteControl() {

    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void buttonWasPressed() {
        command.execute();
    }
}
