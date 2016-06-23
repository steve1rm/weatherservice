package me.androidbox.forecastservice.di;

import android.app.Application;

/**
 * Created by steve on 6/21/16.
 */
public class WeatherApplication extends Application {
    private WeatherComponent mWeatherComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mWeatherComponent = createComponent();
    }

    public WeatherComponent createComponent() {
        return DaggerApplicationComponent
                .builder()
                .weatherModule(new WeatherModule())
                .build();
    }

    public WeatherComponent getWeatherComponent() {
        return mWeatherComponent;
    }
}
