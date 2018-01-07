package designpattern.Observer;

/**
 * Created by zhangyue-k on 2018/1/7.
 * 天气预报布告板：根据气压值显示天气预报
 */
public class ForecastDisplay implements Observer, DisplayElement{
    private float lastPressure;
    private float currentPressure = 29.92f;
    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);

    }

    @Override
    public void display() {
        System.out.println("Forecast: ");
        if(currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        }else if(currentPressure == lastPressure) {
            System.out.println("More of the same");
        }else if(currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }

    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;
        display();
    }
}
