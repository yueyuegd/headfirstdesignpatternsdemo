package designpatterns.command;

/**
 * Created by zhangyue-k on 2018/1/14.
 * 音响关闭命令
 */
public class StereoOffCommand implements Command {

    Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {

    }
}
