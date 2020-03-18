package com.demo.builder;

/**
 * @author zhouwq
 * @date 2020/3/18 15:24
 */

public class HighHouse extends HouseBuilder {

    @Override
    public void buildBasic() {
        System.out.println("high basic");
    }

    @Override
    public void buildWall() {
        System.out.println("high wall");
    }

    @Override
    public void roofed() {
        System.out.println("high roofed");
    }
}
