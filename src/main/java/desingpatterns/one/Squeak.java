package desingpatterns.one;

/**
 * Created by zhangyue-k on 2018/1/7.
 */
public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
