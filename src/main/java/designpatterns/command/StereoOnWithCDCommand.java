package designpatterns.command;

/**
 * Created by zhangyue-k on 2018/1/14.
 * 使用CD打开音响的命令
 */
public class StereoOnWithCDCommand implements Command{
    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }

    @Override
    public void undo() {

    }
}
