package com.study.observer.observer;

/**
 * Created by J.zhu on 2019/2/7.
 */
public interface Observer {
    void update(float temperature, float humidity, float pressure);
}
