package _03简单工厂模式;


public class main {
    //抽象产品
    public interface Product {
        void show();
    }

    //具体产品：ProductA
    public static class ConcreteProduct1 implements Product {
        public void show() {
            System.out.println("具体产品1显示...");
        }
    }

    //具体产品：ProductB
    public static class ConcreteProduct2 implements Product {
        public void show() {
            System.out.println("具体产品2显示...");
        }
    }

    //具体产品：ProductC
    public static class ConcreteProduct3 implements Product {
        public void show() {
            System.out.println("具体产品3显示...");
        }
    }

    final class Const {
        public static final int PRODUCT_A = 0;
        public static final int PRODUCT_B = 1;
        public static final int PRODUCT_C = 2;
    }

    public static class SimpleFactory {
        public static Product makeProduct(int kind) {
            switch (kind) {
                case Const.PRODUCT_A:
                    return new ConcreteProduct1();
                case Const.PRODUCT_B:
                    return new ConcreteProduct2();
                case Const.PRODUCT_C:
                    return new ConcreteProduct3();
            }
            return null;
        }
    }

    public static void main(String[] args) {
        Product product0 = SimpleFactory.makeProduct(0);
        product0.show();
        Product product1 = SimpleFactory.makeProduct(1);
        product1.show();
        Product product2 = SimpleFactory.makeProduct(2);
        product2.show();
    }
}
