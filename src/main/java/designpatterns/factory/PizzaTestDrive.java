package designpatterns.factory;

/**
 * Created by zhangyue-k on 2018/1/11.
 */
public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChiccagoStyleStore();

        Pizza pizza = pizzaStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}
