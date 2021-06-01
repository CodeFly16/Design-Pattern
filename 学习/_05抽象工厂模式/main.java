package _05抽象工厂模式;

import java.util.List;

public class main {
    public static void main(String[] args) {
        try {
            List<Object> afList = (List<Object>) ReadXML.getObject();
            afList.forEach(item -> {
                AbstractFactory af;
                Product1 a;
                Product2 b;
                af = (AbstractFactory) item;
                a = af.newProduct1();
                a.show();
                b = af.newProduct2();
                b.show();
            });
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

//抽象工厂：提供了厂品的生成方法
interface AbstractFactory {
    public Product1 newProduct1();

    public Product2 newProduct2();
}

//具体工厂1：实现了厂品的生成方法
class ConcreteFactory1 implements AbstractFactory {
    public Product1 newProduct1() {
        System.out.println("具体工厂1生成-->具体产品1.1...");
        return new ConcreteProduct11();
    }

    public Product2 newProduct2() {
        System.out.println("具体工厂1生成-->具体产品1.2...");
        return new ConcreteProduct12();
    }
}

//具体工厂2：实现了厂品的生成方法
class ConcreteFactory2 implements AbstractFactory {
    public Product1 newProduct1() {
        System.out.println("具体工厂2生成-->具体产品2.1...");
        return new ConcreteProduct21();
    }

    public Product2 newProduct2() {
        System.out.println("具体工厂2生成-->具体产品2.2...");
        return new ConcreteProduct22();
    }
}

//抽象产品：提供了产品1的接口
interface Product1 {
    public void show();
}

//抽象产品：提供了产品1的接口
interface Product2 {
    public void show();
}

//具体产品1.1：实现抽象产品中的抽象方法
class ConcreteProduct11 implements Product1 {
    public void show() {
        System.out.println("具体产品1.1显示...");
    }
}

//具体产品1.2：实现抽象产品中的抽象方法
class ConcreteProduct12 implements Product2 {
    public void show() {
        System.out.println("具体产品1.2显示...");
    }
}

//具体产品2.1：实现抽象产品中的抽象方法
class ConcreteProduct21 implements Product1 {
    public void show() {
        System.out.println("具体产品2.1显示...");
    }
}

//具体产品2.2：实现抽象产品中的抽象方法
class ConcreteProduct22 implements Product2 {
    public void show() {
        System.out.println("具体产品2.2显示...");
    }
}
