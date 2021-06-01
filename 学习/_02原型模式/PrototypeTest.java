package _02原型模式;

class RealizeType implements Cloneable {
    RealizeType() {
        System.out.println("具体原型创建成功！");
    }

    public Object clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功！");
        return (RealizeType) super.clone();
    }
}

public class PrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        RealizeType realizeType1 = new RealizeType();
        RealizeType realizeType2 = (RealizeType) realizeType1.clone();
        System.out.println("realizeType1==realizeType2?" + (realizeType1 == realizeType2));
    }
}


