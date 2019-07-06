package com.demo.singleton;

/**
 * 单例（DoubleCheckSingleton）模式的定义：指一个类只有一个实例，且该类能自行创建这个实例的一种模式。
 * 例如，Windows 中只能打开一个任务管理器，这样可以避免因打开多个任务管理器窗口而造成内存资源的浪费，或出现各个窗口显示内容的不一致等错误。
 *
 * 在计算机系统中，还有 Windows 的回收站、操作系统中的文件系统、多线程中的线程池、显卡的驱动程序对象、打印机的后台处理服务、应用程序的日志对象、
 * 数据库的连接池、网站的计数器、Web 应用的配置对象、应用程序中的对话框、系统中的缓存等常常被设计成单例。
 *
 * 单例模式有 3 个特点：
 * 1:单例类只有一个实例对象；
 * 2:该单例对象必须由单例类自行创建；
 * 3:单例类对外提供一个访问该单例的全局访问点；
 *
 *
 * 饿汉式单例
 * 该模式的特点是类一旦加载就创建一个单例，保证在调用 getInstance 方法之前单例已经存在了
 * 饿汉式单例在类创建的同时就已经创建好一个静态的对象供系统使用，以后不再改变，所以是线程安全的，可以直接用于多线程而不会出现问题。
 * @author zhouwq
 * @date 2019/6/28 9:21
 */

public class HungrySingleton {
    private static final HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return instance;
    }
}
