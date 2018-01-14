package designpatterns.singleton;

/**
 * Created by zhangyue-k on 2018/1/14.
 * 最直接的单例模式方式
 */
public class directSingleton {

    public static directSingleton instance;

    private directSingleton() {

    }

    public static directSingleton getInstance() {
        if(instance == null) {
            instance = new directSingleton();
        }
        return instance;
    }
}
