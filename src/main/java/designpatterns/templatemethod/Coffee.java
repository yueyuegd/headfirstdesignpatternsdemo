package designpatterns.templatemethod;

/**
 * Created by zhangyue-k on 2018/1/14.
 */
public class Coffee  extends CoffeineBeverage{



    @Override
    void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }



}
