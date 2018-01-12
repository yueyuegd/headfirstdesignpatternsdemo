package designpatterns.factory;

/**
 * Created by zhangyue-k on 2018/1/10.
 */
public abstract class PizzaStore {


    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
