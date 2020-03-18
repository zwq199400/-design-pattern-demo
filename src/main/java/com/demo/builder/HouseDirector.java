package com.demo.builder;

/**
 * @author zhouwq
 * @date 2020/3/18 15:25
 */

public class HouseDirector {

    HouseBuilder houseBuilder = null;

    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House constructHouse() {
        houseBuilder.buildBasic();
        houseBuilder.roofed();
        houseBuilder.buildWall();
        return houseBuilder.buildHouse();
    }

}
