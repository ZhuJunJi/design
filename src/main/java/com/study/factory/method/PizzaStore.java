package com.study.factory.method;

/**
 * Created by J.zhu on 2019/2/9.
 */
public abstract class PizzaStore {
    protected abstract Pizza createPizza(String item);

    protected abstract void orderPizza();
}