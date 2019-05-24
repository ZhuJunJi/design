package com.study.strategy.duck;

import com.study.strategy.Duck;
import com.study.strategy.behavior.fly.impl.FlyNoWay;
import com.study.strategy.behavior.quack.impl.Squeak;

/**
 * Created by J.zhu on 2019/2/7.
 */
public class RubberDuck extends Duck {

    public RubberDuck(){
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new Squeak());
    }
}
