package designpatterns.decorator;

/**
 * Created by zhangyue-k on 2018/1/9.
 */
public class Decat extends Beverage {

    public Decat() {
        this.description = "Decat";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
