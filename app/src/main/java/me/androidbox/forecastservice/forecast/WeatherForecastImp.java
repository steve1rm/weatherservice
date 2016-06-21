package me.androidbox.forecastservice.forecast;

/**
 * Created by steve on 6/21/16.
 */
public class WeatherForecastImp implements WeatherForecast {
    @Override
    public Weather getWeather() {
        return new Weather();
    }
}
