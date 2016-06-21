package me.androidbox.forecastservice;

import org.mockito.Mockito;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import me.androidbox.forecastservice.forecast.WeatherForecast;

/**
 * Created by steve on 6/21/16.
 */
@Module
public class MockWeatherForecast {
    @Provides
    @Singleton
    public WeatherForecast providesWeatherService() {
        return Mockito.mock(WeatherForecast.class);
    }
}
