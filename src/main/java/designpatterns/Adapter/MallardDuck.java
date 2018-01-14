package designpatterns.Adapter;

/**
 * Created by zhangyue-k on 2018/1/14.
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");

    }
}
