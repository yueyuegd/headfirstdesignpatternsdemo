package designpatterns.Strategy;

/**
 * Created by zhangyue-k on 2018/1/7.
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("gua gua ......");
    }
}
