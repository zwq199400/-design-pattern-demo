package com.demo.strategy;

/**
 * @author zhouwq
 * @date 2019/5/30 18:35
 */

public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("fly");
    }
}
