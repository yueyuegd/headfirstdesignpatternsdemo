package designpatterns.JavaObserver;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by zhangyue-k on 2018/1/7.
 */
public class ForecastDisplay implements Observer, DisplayElement {
    private float currentPressure = 29.92f;
    private float lastPressure;

    public ForecastDisplay(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Forecast: ");
        if(currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        }else if(currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }else if(currentPressure == lastPressure) {
            System.out.println("More of the same");
        }

    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            lastPressure = currentPressure;
            currentPressure = weatherData.getPressure();
            display();
        }

    }
}
