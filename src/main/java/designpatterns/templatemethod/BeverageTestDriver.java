package designpatterns.templatemethod;

/**
 * Created by zhangyue-k on 2018/1/14.
 */
public class BeverageTestDriver {

    public static void main(String[] args) {
        CoffeeWithHook coffeeWithHook = new CoffeeWithHook();
        TeaWithHook teaWithHook = new TeaWithHook();
        System.out.println("Making Tea...");
        teaWithHook.prepareRecipe();
        System.out.println("Making coffee...");
        coffeeWithHook.prepareRecipe();

    }
}
