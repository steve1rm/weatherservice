package me.androidbox.forecastservice.di;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import me.androidbox.forecastservice.forecast.WeatherForecast;
import me.androidbox.forecastservice.forecast.WeatherForecastImp;

/**
 * Created by steve on 6/21/16.
 */
@Module
public class WeatherModule {
    @Provides
    @Singleton
    public WeatherForecast providesWeatherService() {
        return new WeatherForecastImp();
    }
}
