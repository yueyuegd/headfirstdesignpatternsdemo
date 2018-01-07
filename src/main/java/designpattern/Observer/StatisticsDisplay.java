package designpattern.Observer;

/**
 * Created by zhangyue-k on 2018/1/7.
 * 天气统计布告板:跟踪最小，平均，最大的观测值并显示
 */
public class StatisticsDisplay implements Observer, DisplayElement {

    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum = 0.0f;
    private int numRedings;
    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Avg/Min/Max temperature = " + (tempSum / numRedings)
        + "/" + minTemp + "/" + maxTemp);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        tempSum += temp;
        numRedings++;
        if(temp > maxTemp) {
            maxTemp = temp;
        }
        if(temp < minTemp) {
            minTemp = temp;
        }
        display();
    }
}
