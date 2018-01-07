package desingpatterns.one;

/**
 * Created by zhangyue-k on 2018/1/7.
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
