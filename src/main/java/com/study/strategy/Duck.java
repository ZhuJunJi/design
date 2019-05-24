package com.study.strategy;

import com.study.strategy.behavior.fly.FlyBehavior;
import com.study.strategy.behavior.fly.impl.FlyWithWings;
import com.study.strategy.behavior.quack.QuackBehavior;
import com.study.strategy.duck.RubberDuck;

/**
 * Duck
 * Created by J.zhu on 2019/2/7.
 */
public abstract class Duck {

    private FlyBehavior flyBehavior;

    private QuackBehavior quackBehavior;

    public void fly(){
        flyBehavior.fly();
    }

    public void quack(){
        quackBehavior.quack();
    }

    public void swim(){
        System.out.println("All ducks float, even decoys!");
    }

    public void display(){

    }

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public static void main(String[] args) {
        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.fly();
        rubberDuck.quack();

        System.out.println("Change fly behavior");
        rubberDuck.setFlyBehavior(new FlyWithWings());
        rubberDuck.fly();
    }
}
