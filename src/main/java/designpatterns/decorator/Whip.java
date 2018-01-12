package designpatterns.decorator;

/**
 * Created by zhangyue-k on 2018/1/9.
 * 奶泡装饰器
 */
public class Whip extends CondimentDecorator {

    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", whip";
    }

    @Override
    public double cost() {
        return beverage.cost() + .10;
    }
}
