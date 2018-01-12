package designpatterns.factory;

/**
 * Created by zhangyue-k on 2018/1/11.
 */
public class ChiccagoStyleCheesePizza extends Pizza {

    public ChiccagoStyleCheesePizza() {
        this.name = "Chicago Style Deep Dish Cheese Pizza";
        this.dough = "Extra Thick Crust Dough";
        this.sauce = "Plum Tomato Sauce";
        this.toppings.add("Shredded Mozzarella Cheese");
    }



    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");

    }


}
