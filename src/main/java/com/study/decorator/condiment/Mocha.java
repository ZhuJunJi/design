package com.study.decorator.condiment;

import com.study.decorator.base.Beverage;
import com.study.decorator.base.CondimentDecorator;
import com.study.decorator.base.SizeEnum;

/**
 * Created by J.zhu on 2019/2/7.
 */
public class Mocha extends CondimentDecorator {
    private Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        double price = 0;
        SizeEnum sizeEnum = beverage.getSizeEnum();
        switch (sizeEnum){
            case TALL:price = .10;break;
            case GRANDE:price = .15;break;
            case VENTI:price = .20;break;
        }
        return beverage.cost() + price;
    }
}
