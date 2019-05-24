package com.study.factory.method;

import com.study.factory.ingredients.cheese.Cheese;
import com.study.factory.ingredients.clams.Clams;
import com.study.factory.ingredients.dough.Dough;
import com.study.factory.ingredients.pepperoni.Pepperoni;
import com.study.factory.ingredients.sauce.Sauce;
import com.study.factory.ingredients.veggies.Veggies;

/**
 * Created by J.zhu on 2019/2/9.
 */
public abstract class Pizza {
    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Veggies veggies[];
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clams clams;

    abstract public void prepare();

    public void bake(){
        System.out.println("Bake for 25 minutes at 30");
    }

    public void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box(){
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                '}';
    }
}
