package me.androidbox.forecastservice;

import dagger.Module;
import me.androidbox.forecastservice.di.WeatherApplication;
import me.androidbox.forecastservice.di.WeatherComponent;

/**
 * Created by steve on 6/21/16.
 */
@Module
public class MockWeatherModule extends WeatherApplication {
    @Override
    public WeatherComponent createComponent() {
        return super.createComponent();
    }
}
