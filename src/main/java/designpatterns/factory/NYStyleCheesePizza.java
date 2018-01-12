package designpatterns.factory;

/**
 * Created by zhangyue-k on 2018/1/11.
 */
public class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza() {
        this.name = "NY Style Sauce and Cheese Pizza";
        this.dough =  "Thin Crust Dough";
        this.sauce = "Marinara Sauce";
        this.toppings.add("Grated Reddiano Cheese");
    }
}
