package designpatterns.state;

/**
 * Created by zhangyue-k on 2018/1/21.
 * 状态接口
 */
public interface State {
    public void insertQuarter();
    public void ejectQuarter();
    public void turnCrank();
    public void dispense();

    public void refill();
}
