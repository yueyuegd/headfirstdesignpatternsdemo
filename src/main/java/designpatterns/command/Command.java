package designpatterns.command;

/**
 * Created by zhangyue-k on 2018/1/14.
 * 命令接口
 */
public interface Command {

    public void execute();
    public void undo();
}
