package com.study.factory.ingredients.dough;

/**
 * Created by J.zhu on 2019/2/9.
 */
public abstract class Dough {
    protected String name;

    @Override
    public String toString() {
        return "Dough{" +
                "name='" + name + '\'' +
                '}';
    }
}
