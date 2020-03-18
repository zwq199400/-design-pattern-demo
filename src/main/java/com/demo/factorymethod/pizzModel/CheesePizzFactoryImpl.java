package com.demo.factorymethod.pizzModel;

/**
 * @author zhouwq
 * @date 2020/3/7 10:10
 */

public class CheesePizzFactoryImpl implements PizzFactory {
    @Override
    public void prepare() {
        System.out.println("准备 cheese");
    }

    @Override
    public void bake() {
        System.out.println("cheese bake");
    }

    @Override
    public Pizz produce() {
        prepare();
        bake();
        return new CheesePizz();
    }


}
