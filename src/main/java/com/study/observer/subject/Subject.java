package com.study.observer.subject;

import com.study.observer.observer.Observer;

/**
 * Created by J.zhu on 2019/2/7.
 */
public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
