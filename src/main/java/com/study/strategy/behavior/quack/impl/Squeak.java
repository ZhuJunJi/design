package com.study.strategy.behavior.quack.impl;

import com.study.strategy.behavior.quack.QuackBehavior;

/**
 * Created by J.zhu on 2019/2/7.
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("zi zi zi....");
    }
}
