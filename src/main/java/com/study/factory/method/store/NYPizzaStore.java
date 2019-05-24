package com.study.factory.method.store;

import com.study.factory.method.Pizza;
import com.study.factory.method.PizzaStore;
import com.study.factory.method.factory.NYPizzaIngredientFactory;
import com.study.factory.method.factory.PizzaIngredientFactory;
import com.study.factory.pizza.CheesePizza;
import com.study.factory.pizza.ClamPizza;
import com.study.factory.pizza.PepperoniPizza;
import com.study.factory.pizza.ViggiePizza;

/**
 * Created by J.zhu on 2019/2/9.
 */
public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String style) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        if("cheese".equals(style)){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        }else if ("veggie".equals(style)){
            pizza = new ViggiePizza(ingredientFactory);
            pizza.setName("New York Style Veggie Pizza");
        }else if("clam".equals(style)){
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");
        }else if ("pepperoni".equals(style)){
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");
        }
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    @Override
    protected void orderPizza() {
        
    }
}
