package com.demo.factorymethod.pizzModel;

import java.util.Objects;

/**
 * @author zhouwq
 * @date 2020/3/7 10:11
 */

public class PizzOrder {
    public static void main(String[] args) {
        PizzFactory pizzFactory;
        String name = "sad";
        if (Objects.equals(name, "cheese")) {
            pizzFactory = new CheesePizzFactoryImpl();
        } else {
            pizzFactory = new GreekPizzFactoryImpl();
        }
        Pizz pizz = pizzFactory.produce();
        pizz.show();
    }
}
