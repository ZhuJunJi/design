package com.study.strategy.behavior.fly.impl;

import com.study.strategy.behavior.fly.FlyBehavior;

/**
 * Created by J.zhu on 2019/2/7.
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Fly in the sky");
    }
}
