package designpatterns.templatemethod;

/**
 * Created by zhangyue-k on 2018/1/14.
 */
public abstract class CoffeineBeverageWithHook {
    void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if(customerWantsCondiments()) {
            addCondiments();
        }
    }

    abstract void brew();
    abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }
    boolean customerWantsCondiments() {
        return true;
    }

}
