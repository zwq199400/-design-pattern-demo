package com.demo.factorymethod.pizzModel;

/**
 * @author zhouwq
 * @date 2020/3/7 10:09
 */

public class GreekPizzFactoryImpl implements PizzFactory {
    @Override
    public void prepare() {
        System.out.println("准备greek");
    }

    @Override
    public void bake() {
        System.out.println("bake Greek");
    }

    @Override
    public Pizz produce() {
        prepare();
        bake();
        return new GreekPizz();
    }
}
