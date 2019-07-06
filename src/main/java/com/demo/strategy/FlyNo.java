package com.demo.strategy;

/**
 * @author zhouwq
 * @date 2019/5/30 18:36
 */

public class FlyNo implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("cannot fly");
    }
}
