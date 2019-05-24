package com.study.factory.pizza;

import com.study.factory.method.Pizza;
import com.study.factory.method.factory.PizzaIngredientFactory;

/**
 * Created by J.zhu on 2019/2/9.
 */
public class CheesePizza extends Pizza {

    private PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }
    @Override
    public void prepare() {
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
