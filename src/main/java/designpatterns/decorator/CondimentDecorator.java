package designpatterns.decorator;

/**
 * Created by zhangyue-k on 2018/1/9.
 * 装饰者类
 */
public abstract class CondimentDecorator extends Beverage{
    @Override
    public double cost() {
        return 0;
    }

    @Override
    public abstract String getDescription();

}
