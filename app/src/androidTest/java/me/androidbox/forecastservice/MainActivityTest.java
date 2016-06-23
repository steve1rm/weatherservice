package me.androidbox.forecastservice;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.support.test.runner.AndroidJUnitRunner;

import org.junit.Rule;
import org.junit.runner.RunWith;

import javax.inject.Inject;

import me.androidbox.forecastservice.forecast.WeatherForecast;

/**
 * Created by steve on 6/23/16.
 */
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {
    @Rule
    public ActivityTestRule<MainActivity> mainActivity = new ActivityTestRule<MainActivity>(
            MainActivity.class,
            true,
            false); /* Do not launch immediately */

    @Inject WeatherForecast mWeatherForecast;

    
}
