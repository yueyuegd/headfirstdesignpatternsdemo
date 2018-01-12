package designpatterns.decorator;

/**
 * Created by zhangyue-k on 2018/1/9.
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        this.description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
