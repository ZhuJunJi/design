package com.study.factory.ingredients.sauce;

/**
 * Created by J.zhu on 2019/2/9.
 */
public abstract class Sauce {
    protected String name;

    @Override
    public String toString() {
        return "Sauce{" +
                "name='" + name + '\'' +
                '}';
    }
}
