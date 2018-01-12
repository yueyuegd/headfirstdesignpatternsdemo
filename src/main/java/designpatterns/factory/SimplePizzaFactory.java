package designpatterns.factory;

/**
 * Created by zhangyue-k on 2018/1/10.
 * 创建披萨的工厂
 */
public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equals("cheess")) {
            pizza = new CheesePizza();
        }else if(type.equals("pepperoni")) {
            pizza = new Pepperoni();
        }else if(type.equals("clam")) {
            pizza = new ClamPizza();
        }else if(type.equals("veggie")) {
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}
