package com.demo.strategy;

/**
 * @author zhouwq
 * @date 2019/5/30 18:29
 */

public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
