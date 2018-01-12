package designpatterns.decorator;

/**
 * Created by zhangyue-k on 2018/1/9.
 */
public class Espresso extends Beverage {

    public Espresso() {
        this.description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
