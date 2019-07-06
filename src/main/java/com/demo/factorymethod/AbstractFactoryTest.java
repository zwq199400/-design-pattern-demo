package com.demo.factorymethod;

/**
 * 工厂方法（FactoryMethod）模式的定义：定义一个创建产品对象的工厂接口，
 * 将产品对象的实际创建工作推迟到具体子工厂类当中。这满足创建型模式中所要求的“创建与使用相分离”的特点。
 *
 * 我们把被创建的对象称为“产品”，把创建产品的对象称为“工厂”。如果要创建的产品不多，
 * 只要一个工厂类就可以完成，这种模式叫“简单工厂模式”，它不属于 GoF 的 23 种经典设计模式，它的缺点是增加新产品时会违背“开闭原则”。
 *
 *
 * 工厂方法模式的主要优点有：
 * 用户只需要知道具体工厂的名称就可得到所要的产品，无须知道产品的具体创建过程；
 * 在系统增加新的产品时只需要添加具体产品类和对应的具体工厂类，无须对原工厂进行任何修改，满足开闭原则；
 *
 * 其缺点是：每增加一个产品就要增加一个具体产品类和一个对应的具体工厂类，这增加了系统的复杂度。
 *
 * 工厂方法模式的主要角色如下。
 * 抽象工厂（Abstract Factory）：提供了创建产品的接口，调用者通过它访问具体工厂的工厂方法 newProduct() 来创建产品。
 * 具体工厂（ConcreteFactory）：主要是实现抽象工厂中的抽象方法，完成具体产品的创建。
 * 抽象产品（Product）：定义了产品的规范，描述了产品的主要特性和功能。
 * 具体产品（ConcreteProduct）：实现了抽象产品角色所定义的接口，由具体工厂来创建，它同具体工厂之间一一对应。
 *
 * @author zhouwq
 * @date 2019/6/28 15:54
 */

public class AbstractFactoryTest
{
    public static void main(String[] args)
    {
        try
        {
            AbstractFactory p1 = new ConcreteFactory1();
            Product a1 = p1.newProduct();
            AbstractFactory p2 = new ConcreteFactory2();
            Product a2 = p2.newProduct();
            a1.show();
            a2.show();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
/**
 * 抽象产品：提供了产品的接口
 */
interface Product
{
    public void show();
}

/**
 * 具体产品1：实现抽象产品中的抽象方法
 */
class ConcreteProduct1 implements Product
{
    @Override
    public void show()
    {
        System.out.println("具体产品1显示...");
    }
}

/**
 * 具体产品2：实现抽象产品中的抽象方法
 */
class ConcreteProduct2 implements Product
{
    @Override
    public void show()
    {
        System.out.println("具体产品2显示...");
    }
}

/**
 * 抽象工厂：提供了厂品的生成方法
 */
interface AbstractFactory
{
    public Product newProduct();
}

/**
 * 具体工厂1：实现了厂品的生成方法
 */
class ConcreteFactory1 implements AbstractFactory
{
    @Override
    public Product newProduct()
    {
        System.out.println("具体工厂1生成-->具体产品1...");
        return new ConcreteProduct1();
    }
}

/**
 * 具体工厂2：实现了厂品的生成方法
 */
class ConcreteFactory2 implements AbstractFactory
{
    @Override
    public Product newProduct()
    {
        System.out.println("具体工厂2生成-->具体产品2...");
        return new ConcreteProduct2();
    }
}
