package observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Authors: wangbiwen
 * Date: 11/5/18
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        weatherData.setMeasurements(0, 0, 0);
        weatherData.setMeasurements(1, 1, 1);
    }
}

class StatisticsDisplay implements Observer {
    public StatisticsDisplay(Observable weatherData) {
        weatherData.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        WeatherData weatherData = (WeatherData) o;
        System.out.println("StatisticDisplay.update: "
                + weatherData.getTemperature() + ", "
                + weatherData.getHumidity() + ", "
                + weatherData.getPressure());
    }
}

class CurrentConditionDisplay implements Observer {
    public CurrentConditionDisplay(Observable weatherData) {
        weatherData.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        WeatherData weatherData = (WeatherData) o;
        System.out.println("CurrentConditionDisplay.update: "
                + weatherData.getTemperature() + ", "
                + weatherData.getHumidity() + ", "
                + weatherData.getPressure());
    }
}
