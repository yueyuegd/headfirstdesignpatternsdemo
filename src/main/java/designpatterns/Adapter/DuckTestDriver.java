package designpatterns.Adapter;

/**
 * Created by zhangyue-k on 2018/1/14.
 * 测试火鸡适配器
 */
public class DuckTestDriver {

    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        WildTurkey wildTurkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);

        System.out.println("The Turkey says...");
        wildTurkey.gobble();
        wildTurkey.fly();

        System.out.println("The duck says...");
        mallardDuck.quack();
        mallardDuck.fly();

        System.out.println("The TurkeyAdapter says...");
        turkeyAdapter.quack();
        turkeyAdapter.fly();
    }
}
