package com.demo.builder;

/**
 * @author zhouwq
 * @date 2020/3/18 15:30
 */

public class Client {

    public static void main(String[] args) {
        CommonHouse commonHouse = new CommonHouse();

        HouseDirector houseDirector = new HouseDirector(commonHouse);

        House house = houseDirector.constructHouse();

        System.out.println(house.toString());
    }
}
