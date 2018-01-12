package designpatterns.decorator;

/**
 * Created by zhangyue-k on 2018/1/9.
 */
public abstract class Beverage {

    String description = "Unkonwn Beverage";
    public String getDescription() {
        return description;
    }
    public abstract double cost();
}
