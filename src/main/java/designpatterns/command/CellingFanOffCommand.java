package designpatterns.command;

/**
 * Created by zhangyue-k on 2018/1/14.
 * 起居室吊扇关闭命令
 */
public class CellingFanOffCommand implements Command{
    CellingFan cellingFan;

    public CellingFanOffCommand(CellingFan cellingFan) {
        this.cellingFan = cellingFan;
    }

    @Override
    public void execute() {
        cellingFan.off();
    }

    @Override
    public void undo() {

    }
}
