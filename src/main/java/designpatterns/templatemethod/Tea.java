package designpatterns.templatemethod;

/**
 * Created by zhangyue-k on 2018/1/14.
 */
public class Tea extends CoffeineBeverage{



    @Override
    void brew() {
        System.out.println("Steeping the tea");

    }

    @Override
    void addCondiments() {
        System.out.println("Adding Lemon");

    }
}
