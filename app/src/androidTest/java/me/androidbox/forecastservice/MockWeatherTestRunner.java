package me.androidbox.forecastservice;

import android.app.Application;
import android.content.Context;
import android.test.AndroidTestRunner;
import android.support.test.runner.AndroidJUnitRunner;

import junit.framework.TestListener;

/**
 * Created by steve on 6/23/16.
 */
public class MockWeatherTestRunner extends AndroidJUnitRunner {
    @Override
    public Application newApplication(ClassLoader cl, String className, Context context)
            throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return super.newApplication(cl, MockWeatherApplication.class.getName(), context);
    }
}
