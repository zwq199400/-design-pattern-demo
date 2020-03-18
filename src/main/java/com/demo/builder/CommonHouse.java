package com.demo.builder;

/**
 * @author zhouwq
 * @date 2020/3/18 15:23
 */

public class CommonHouse extends HouseBuilder {

    @Override
    public void buildBasic() {
        System.out.println("common build");
    }

    @Override
    public void buildWall() {
        System.out.println("common wall");
    }

    @Override
    public void roofed() {
        System.out.println("common roofed");
    }
}
