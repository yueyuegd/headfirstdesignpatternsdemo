package designpattern.Observer;

import java.util.ArrayList;

/**
 * Created by zhangyue-k on 2018/1/7.
 */
public class WeatherData implements Subject {

    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observers = new ArrayList();
    }

    //注册观察者
    @Override
    public void registerObserver(Observer o) {
        this.observers.add(o);
    }

    //取消注册
    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if(i >= 0) {
           observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer o = (Observer)observers.get(i);
            o.update(temperature, humidity, pressure);
        }
    }

    //当气象站得到更新观测值的时候通知观察者
    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
