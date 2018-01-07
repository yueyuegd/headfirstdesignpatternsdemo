package desingpatterns.one;

/**
 * Created by zhangyue-k on 2018/1/7.
 * 建立一个利用火箭动力的飞行行为
 */
public class FlyRocketPowered implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
