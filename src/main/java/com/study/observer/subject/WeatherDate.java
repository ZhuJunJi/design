package com.study.observer.subject;

import com.study.observer.observer.Observer;
import com.study.observer.observer.impl.CurrentConditionsDisplay;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by J.zhu on 2019/2/7.
 */
public class WeatherDate implements Subject{
    private float temperature;
    private float humidity;
    private float pressure;

    private List<Observer> observers;

    public WeatherDate(){
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if(i >= 0){
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        observers.forEach(o->o.update(temperature,humidity,pressure));
    }

    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public static void main(String[] args) {
        WeatherDate weatherDate = new WeatherDate();

        new CurrentConditionsDisplay(weatherDate);

        weatherDate.setMeasurements(80, 65, 30.4f);
        weatherDate.setMeasurements(82, 70, 29.2f);
        weatherDate.setMeasurements(78, 90, 29.2f);
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public List<Observer> getObservers() {
        return observers;
    }
}
