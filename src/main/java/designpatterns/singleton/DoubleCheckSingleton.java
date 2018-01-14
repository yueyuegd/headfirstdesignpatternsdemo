package designpatterns.singleton;

/**
 * Created by zhangyue-k on 2018/1/14.
 * 使用双重检查加锁，减少方法中使用同步
 */
public class DoubleCheckSingleton {

    public volatile static DoubleCheckSingleton instance;

    private DoubleCheckSingleton() {

    }

    public static DoubleCheckSingleton getInstance() {
        if(instance == null) {
            synchronized (DoubleCheckSingleton.class) {
                if(instance == null) {
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
