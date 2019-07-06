## `策略模式`

### 定义：

定义一系列的算法，把它们一个个封装起来, 并且使它们可相互替换。策略模式让算法独立于它的使用者之外，可以自由修改。



来看看UML图，图中主要由三个部分组成

Context：上下文环境，持有Strategy引用
Strategy：抽象策略，接口（或抽象类）
ConcreteStrategy：具体实现策略，实现了具体的算法
![image](https://upload-images.jianshu.io/upload_images/595349-286452a59a854726.png)
                                         




Strategy是使用接口还是抽象类，这个取决于一系列的策略中是否有共同属性或方法；如果没有，使用接口更加灵活方便，反之使用抽象类，抽象类中便可存放公共的属性以及方法。


策略模式，其实可以简单地理解成，将过多的switch case中case的代码封装成一个个具有共性的对象，需要什么我们就直接使用什么；对于这种共性的实现就利用interface或者是抽象类来实现。这从对代码的封装以及解耦的角度来理解，可能会更加容易理解。
使用场景

针对同一类问题的多种处理方式，仅仅是具体行为有差别时
需要安全的封装多种同一类型的操作时
出现同一抽象类的多个子类，而有需要使用switch case或if else来选择具体子类时

### 优点

结构清晰、简单直观
耦合度低，方便扩张
操作封装更加彻底，数据更安全

### 缺点

使用者必须熟知具策略的使用方式
随着策略的增加，具体的策略子类也会变得更多






==================================================================================





### **概念**

其思想是针对一组算法，将每一种算法都封装到具有共同接口的独立的类中，从而是它们可以相互替换。策略模式的最大特点是使得算法可以在不影响客户端的情况下发生变化，从而改变不同的功能。

### **特点**

策略模式体现了面向对象程序设计中非常重要的两个原则：

封装变化的概念。

编程中使用接口，而不是使用的是具体的实现类(面向接口编程)。

### **举例：**

我们就以Java中的TreeSet为例，TreeSet仅仅知道它只是接收一个Comparator这种接口类型，但是具体是哪种实现类，TreeSet并不关心，实现类在真正的传入TreeSet之前，TreeSet本身是不知道的，所以我们可以自己去实现Comparator接口，然后在实现类里面去封装好我们自己的规则（这里的规则你可以当做是算法），比如说我们要实现对一个集合的元素排序，但是到底是要升序排序还是降序排序，这个完全由我们来去控制，我们可以把这种变化的内容封装到自己的实现类中，真正运行的时候才知道具体的实现。