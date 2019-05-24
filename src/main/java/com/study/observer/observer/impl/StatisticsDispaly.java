package com.study.observer.observer.impl;

import com.study.observer.observer.DisplayElement;
import com.study.observer.observer.Observer;
import com.study.observer.subject.Subject;

/**
 * Created by J.zhu on 2019/2/7.
 */
public class StatisticsDispaly implements Observer, DisplayElement {

    private Subject weatherData;

    public StatisticsDispaly(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {

    }

    @Override
    public void update(float temperature, float humidity, float pressure) {

    }
}
