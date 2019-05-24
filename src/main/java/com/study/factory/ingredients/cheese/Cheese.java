package com.study.factory.ingredients.cheese;

/**
 * Created by J.zhu on 2019/2/9.
 */
public abstract class Cheese {
    protected String name;

    @Override
    public String toString() {
        return "Cheese{" +
                "name='" + name + '\'' +
                '}';
    }
}
