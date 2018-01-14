package designpatterns.command;

/**
 * Created by zhangyue-k on 2018/1/14.
 * 起居室吊扇打开命令
 */
public class CellingFanOnCommand implements Command{

    CellingFan cellingFan;

    public CellingFanOnCommand(CellingFan cellingFan) {
        this.cellingFan = cellingFan;
    }

    @Override
    public void execute() {
      cellingFan.high();
    }
}
