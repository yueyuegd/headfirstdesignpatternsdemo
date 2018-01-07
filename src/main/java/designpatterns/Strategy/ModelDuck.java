package designpatterns.Strategy;

/**
 * Created by zhangyue-k on 2018/1/7.
 * @author zhangyue
 * 模型鸭
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        quackBehavior = new Quack();
        //一开始是不会飞
        flyBehavior = new FlyNoWay();
    }

    public void display() {
        System.out.println("I'm a model duck");
    }
}
