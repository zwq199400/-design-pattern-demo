package com.demo.factorymethod.pizzModel;

/**
 * @author zhouwq
 * @date 2020/3/7 10:06
 */

public interface PizzFactory {

    void prepare();

    void bake();

    Pizz produce();
}
