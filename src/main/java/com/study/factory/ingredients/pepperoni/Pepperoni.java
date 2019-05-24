package com.study.factory.ingredients.pepperoni;

/**
 * Created by J.zhu on 2019/2/9.
 */
public abstract class Pepperoni {
    protected String name;

    @Override
    public String toString() {
        return "Pepperoni{" +
                "name='" + name + '\'' +
                '}';
    }
}
