package me.androidbox.forecastservice;

import me.androidbox.forecastservice.di.WeatherApplication;
import me.androidbox.forecastservice.di.WeatherComponent;

/**
 * Created by steve on 6/21/16.
 */
public class MockWeatherApplication extends WeatherApplication {
    @Override
    public WeatherComponent createComponent() {
        return DaggerTestingComponent
                .builder()
                .mockWeatherModule(new MockWeatherModule())
                .build();
    }
}
