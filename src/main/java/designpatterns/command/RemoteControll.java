package designpatterns.command;

import java.util.Arrays;

/**
 * Created by zhangyue-k on 2018/1/14.
 * 实现遥控器
 */
public class RemoteControll {

    Command[] onCommands;
    Command[] offCommands;

    public RemoteControll() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command onCommond = new NoCommand();
        for(int i = 0; i < 7; i++) {
            onCommands[i] = onCommond;
            offCommands[i] = onCommond;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n--------Remote Control-----\n");
        for(int i = 0; i < onCommands.length; i++) {
            stringBuffer.append("[" + i + "]" + onCommands[i].getClass().getName()
                    + "   " + offCommands[i].getClass().getName() + "\n");
        }
        return stringBuffer.toString();
    }
}
