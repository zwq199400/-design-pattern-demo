package com.demo.singleton;

/**
 * 双检锁/双重校验锁（DCL，即 double-checked locking）
 * @author zhouwq
 * @date 2019/7/6 15:29
 */

public class DoubleCheckSingleton {

    /**
     * volatile关键字 解决了重排序引起的双重校验的问题
     */
    private volatile static DoubleCheckSingleton doubleCheckSingleton;

    private DoubleCheckSingleton(){}

    public static DoubleCheckSingleton getDoubleCheckSingleton() {
        //处理了懒汉式单例中对于访问时都要同步，会影响性能，且消耗更多的资源的问题
        if (doubleCheckSingleton == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (doubleCheckSingleton == null) {
                    //此处若无关键字volatile修饰，因此处操作非原子性，在重排序时会引发问题
                    doubleCheckSingleton = new DoubleCheckSingleton();
                }
            }
        }

        return doubleCheckSingleton;
    }

    //26行代码
    // doubleCheckSingleton = new DoubleCheckSingleton();
    // 实际上可以分解成以下三个步骤：
    //
    //1 分配内存空间
    //2 初始化对象
    //3 将对象指向刚分配的内存空间
    //但是有些编译器为了性能的原因，可能会将第二步和第三步进行重排序，顺序就成了：
    //
    //1 分配内存空间
    //2 将对象指向刚分配的内存空间
    //3 初始化对象
    //现在考虑重排序后，两个线程发生了以下调用：
    //
    //Time	Thread A	                        Thread B
    //T1	检查到uniqueSingleton为空
    //T2	获取锁
    //T3	再次检查到uniqueSingleton为空
    //T4	为uniqueSingleton分配内存空间
    //T5	将uniqueSingleton指向内存空间
    //T6		                                检查到uniqueSingleton不为空
    //T7		                                访问uniqueSingleton（此时对象还未完成初始化）
    //T8	初始化uniqueSingleton
    //在这种情况下，T7时刻线程B对uniqueSingleton的访问，访问的是一个初始化未完成的对象。
}
