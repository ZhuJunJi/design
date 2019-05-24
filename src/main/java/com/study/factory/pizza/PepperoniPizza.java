package com.study.factory.pizza;

import com.study.factory.method.Pizza;
import com.study.factory.method.factory.PizzaIngredientFactory;

/**
 * Created by J.zhu on 2019/2/9.
 */
public class PepperoniPizza extends Pizza {
    private PizzaIngredientFactory ingredientFactory;

    public PepperoniPizza (PizzaIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }
    @Override
    public void prepare() {
        pepperoni = ingredientFactory.createPepperoni();
    }
}
