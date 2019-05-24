package com.study.decorator.beverage;

import com.study.decorator.base.Beverage;
import com.study.decorator.base.SizeEnum;

/**
 * Created by J.zhu on 2019/2/7.
 */
public class Espresso extends Beverage {

    public Espresso(SizeEnum sizeEnum){
        setSizeEnum(sizeEnum);
        description = "Espresso";
    }
    @Override
    public double cost() {
        return 1.99;
    }
}
