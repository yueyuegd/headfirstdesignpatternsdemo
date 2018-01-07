package desingpatterns.one;

/**
 * Created by zhangyue-k on 2018/1/7.
 */
public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.performQuack();
        duck.performFly();

        //模拟模型鸭一开始不可以飞行后来可以通过火箭动力飞行
        //实现运行时改变鸭子的行为
        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
    }
}
