package com.demo.factorymethod.pizzModel;

/**
 * @author zhouwq
 * @date 2020/3/7 10:05
 */

public class CheesePizz implements Pizz {

    @Override
    public void show() {
        System.out.println("cheese!!!");
    }
}
