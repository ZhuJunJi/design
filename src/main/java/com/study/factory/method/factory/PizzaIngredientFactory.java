package com.study.factory.method.factory;

import com.study.factory.ingredients.cheese.Cheese;
import com.study.factory.ingredients.clams.Clams;
import com.study.factory.ingredients.dough.Dough;
import com.study.factory.ingredients.pepperoni.Pepperoni;
import com.study.factory.ingredients.sauce.Sauce;
import com.study.factory.ingredients.veggies.Veggies;

/**
 * Created by J.zhu on 2019/2/9.
 */
public abstract class PizzaIngredientFactory {
   public abstract Dough createDough();
   public abstract Sauce createSauce();
   public abstract Cheese createCheese();
   public abstract Veggies[] createVeggies();
   public abstract Pepperoni createPepperoni();
   public abstract Clams createClams();
}
