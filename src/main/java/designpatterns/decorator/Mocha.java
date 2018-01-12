package designpatterns.decorator;

/**
 * Created by zhangyue-k on 2018/1/9.
 * 摩卡装饰器
 */
public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + .20;
    }
}
