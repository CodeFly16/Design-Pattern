package _08适配器模式;

public class ClassAdapterTest {
    public static void main(String[] args) {
        Target target = new ClassAdapter();
        target.request();
    }
}

interface Target {
    void request();
}

class Adaptee {
    void specificRequest() {
        System.out.println("适配器操作");
    }
}

class ClassAdapter extends Adaptee implements Target {

    @Override
    public void request() {
        specificRequest();
        System.out.println("其他特殊处理");
    }
}

