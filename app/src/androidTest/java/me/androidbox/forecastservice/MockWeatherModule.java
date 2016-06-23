package me.androidbox.forecastservice;

import org.mockito.Mockito;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import me.androidbox.forecastservice.di.WeatherApplication;
import me.androidbox.forecastservice.di.WeatherComponent;
import me.androidbox.forecastservice.forecast.WeatherForecast;
import me.androidbox.forecastservice.forecast.WeatherForecastImp;

/**
 * Created by steve on 6/21/16.
 */
@Module
public class MockWeatherModule {
    @Singleton
    @Provides
    public WeatherForecast providesWeatherForecast() {
        /* Mocking the interface */
        return Mockito.mock(WeatherForecast.class);
    }
}
