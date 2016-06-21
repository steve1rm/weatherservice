package me.androidbox.forecastservice.di;

import me.androidbox.forecastservice.MainActivity;

/**
 * Created by steve on 6/21/16.
 */
public interface WeatherComponent {
    void inject(MainActivity target);
}
