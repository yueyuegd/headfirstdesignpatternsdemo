package designpatterns.Adapter;

/**
 * Created by zhangyue-k on 2018/1/14.
 * 火鸡适配器：用来使火鸡表现的和鸭子一样
 */
public class TurkeyAdapter implements Duck {
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for(int i = 0; i < 5; i++) {
            turkey.fly();
        }

    }
}
