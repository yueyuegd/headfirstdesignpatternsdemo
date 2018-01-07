package designpattern.Observer;

/**
 * Created by zhangyue-k on 2018/1/7.
 * 观察者模式-主题对象
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();

}
