package com.demo.builder;

/**
 * 建造者模式
 * @author zhouwq
 * @date 2020/3/18 14:56
 */

public abstract class HouseBuilder {

    protected House house = new House();

    public abstract void buildBasic();

    public abstract void buildWall();

    public abstract void roofed();

    public House buildHouse() {
        return house;
    }
}
