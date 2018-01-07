package designpatterns.JavaObserver;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by zhangyue-k on 2018/1/7.
 */
public class CurrentConditionsDisplay implements DisplayElement, Observer {

    private Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {

        System.out.println("Current condition: " + temperature + "F degrees and " + humidity +"% humidity");

    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData)o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();

        }

    }
}
