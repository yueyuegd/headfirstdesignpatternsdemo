package designpatterns.singleton;

/**
 * Created by zhangyue-k on 2018/1/14.
 * 处理多线程的单例模式：使用同步
 */
public class MultiThreadSingleton {
    public static MultiThreadSingleton instance;

    private MultiThreadSingleton() {

    }

    public static synchronized MultiThreadSingleton getInstance() {
        if(instance == null) {
            instance = new MultiThreadSingleton();
        }
        return instance;
    }
}
