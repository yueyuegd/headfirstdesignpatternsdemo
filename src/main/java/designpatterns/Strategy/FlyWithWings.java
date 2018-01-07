package designpatterns.Strategy;

/**
 * Created by zhangyue-k on 2018/1/7.
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("fly fly ......");
    }
}
