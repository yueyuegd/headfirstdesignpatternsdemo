package designpatterns.decorator;

/**
 * Created by zhangyue-k on 2018/1/9.
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        this.description = "DarkRoast";
    }

    @Override
    public double cost() {
        return .99;
    }
}
