package _14模版模式;

public class main {
    private static AbstractClass tm;
    public static void main(String[] args) {
        tm = new ConcreteClass();
        tm.TemplateMethod();
    }
}

//抽象类
abstract class AbstractClass{
    void TemplateMethod(){
        SpecificMethod();
        abstractMethod1();
        abstractMethod2();
    }
    void SpecificMethod(){
        System.out.println("模版方法定义特殊方法");
    }
    abstract void abstractMethod1();
    abstract void abstractMethod2();
}

//具体子类
class ConcreteClass extends AbstractClass{

    @Override
    void abstractMethod1() {
        System.out.println("子类重写具体方法1");
    }

    @Override
    void abstractMethod2() {
        System.out.println("子类重写具体方法2");
    }
}