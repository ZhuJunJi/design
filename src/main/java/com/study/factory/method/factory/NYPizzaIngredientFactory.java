package com.study.factory.method.factory;

import com.study.factory.ingredients.cheese.Cheese;
import com.study.factory.ingredients.cheese.impl.NYCheese;
import com.study.factory.ingredients.clams.Clams;
import com.study.factory.ingredients.clams.impl.NYClams;
import com.study.factory.ingredients.dough.Dough;
import com.study.factory.ingredients.dough.impl.NYDough;
import com.study.factory.ingredients.pepperoni.Pepperoni;
import com.study.factory.ingredients.pepperoni.impl.NYBigPepperoni;
import com.study.factory.ingredients.sauce.Sauce;
import com.study.factory.ingredients.sauce.impl.ChiliSauce;
import com.study.factory.ingredients.veggies.Veggies;
import com.study.factory.ingredients.veggies.impl.Garlic;
import com.study.factory.ingredients.veggies.impl.Onine;

/**
 * Created by J.zhu on 2019/2/9.
 */
public class NYPizzaIngredientFactory extends PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new NYDough();
    }

    @Override
    public Sauce createSauce() {
        return new ChiliSauce();
    }

    @Override
    public Cheese createCheese() {
        return new NYCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new Garlic(),new Onine()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new NYBigPepperoni();
    }

    @Override
    public Clams createClams() {
        return new NYClams();
    }
}
