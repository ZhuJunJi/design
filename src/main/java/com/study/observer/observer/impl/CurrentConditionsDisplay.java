package com.study.observer.observer.impl;

import com.study.observer.observer.DisplayElement;
import com.study.observer.observer.Observer;
import com.study.observer.subject.Subject;

/**
 * Created by J.zhu on 2019/2/7.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float sum = 0;
    private float count = 0;
    private float max = Float.MIN_VALUE;
    private float min = Float.MAX_VALUE;
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
        System.out.println("Avg/Max/Min temperature = " + sum/count + "/" + max + "/" + min);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        count++;
        sum += temperature;
        max = Math.max(temperature,max);
        min = Math.min(temperature,min);
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
