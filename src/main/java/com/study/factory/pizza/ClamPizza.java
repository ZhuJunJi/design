package com.study.factory.pizza;

import com.study.factory.method.Pizza;
import com.study.factory.method.factory.PizzaIngredientFactory;

/**
 * Created by J.zhu on 2019/2/9.
 */
public class ClamPizza extends Pizza {
    private PizzaIngredientFactory ingredientFactory;
    public ClamPizza(PizzaIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }
    @Override
    public void prepare() {
        clams = ingredientFactory.createClams();
        veggies = ingredientFactory.createVeggies();
    }
}
