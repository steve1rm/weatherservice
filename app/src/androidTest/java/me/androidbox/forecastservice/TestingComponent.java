package me.androidbox.forecastservice;

import javax.inject.Singleton;

import dagger.Component;
import me.androidbox.forecastservice.di.WeatherComponent;

/**
 * Created by steve on 6/21/16.
 */
@Singleton
@Component(modules = {MockWeatherModule.class})
public interface TestingComponent extends WeatherComponent {
    void inject(MainActivityTest target);
}
