package com.demo.singleton;

/**
 * 登记式/静态内部类
 * @author zhouwq
 * @date 2019/7/6 16:35
 */

public class StaticSingleton {

    private static class SingletonHolder {
        private static final StaticSingleton INSTANCE = new StaticSingleton();
    }
    private StaticSingleton (){}
    public static final StaticSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
