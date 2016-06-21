package me.androidbox.forecastservice.di;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by steve on 6/21/16.
 */
@Singleton
@Component(modules = {WeatherModule.class})
public interface ApplicationComponent extends WeatherComponent {
}
