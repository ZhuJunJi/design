package com.study.decorator.base;

import com.study.decorator.beverage.Espresso;
import com.study.decorator.condiment.Mocha;

/**
 * Created by J.zhu on 2019/2/7.
 */
public abstract class Beverage {

    private SizeEnum sizeEnum;

    protected String description = "Unknown Beverage";

    public String getDescription(){
        return description;
    }

    public abstract double cost();

    public SizeEnum getSizeEnum() {
        return sizeEnum;
    }

    public void setSizeEnum(SizeEnum sizeEnum) {
        this.sizeEnum = sizeEnum;
    }

    public static void main(String[] args) {
        Beverage espresso = new Espresso(SizeEnum.GRANDE);
        System.out.println(espresso.getDescription());
        System.out.println(espresso.cost());
        espresso = new Mocha(espresso);
        System.out.println(espresso.getDescription());
        System.out.println(espresso.cost());
    }
}
