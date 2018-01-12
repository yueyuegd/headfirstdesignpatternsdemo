package designpatterns.factory;

/**
 * Created by zhangyue-k on 2018/1/11.
 */
public class ChiccagoStyleStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if(type.equals("cheese")) {
            return new ChiccagoStyleCheesePizza();
        }else if(type.equals("veggie")) {
            return new ChiccagoStyleVeggiePizza();
        }else if(type.equals("clam")) {
            return new ChiccagoStyleClamPizza();
        }else if(type.equals("pepperoni")) {
            return new ChiccagoStylePepperoniPizza();
        }else {
            return null;
        }
    }
}
