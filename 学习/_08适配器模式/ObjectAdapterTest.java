package _08适配器模式;

public class ObjectAdapterTest {
    public static void main(String[] args) {
        _Adaptee adaptee = new _Adaptee();
        _Target target = new ObjectAdapter(adaptee);
        target.request();
    }
}

interface _Target {
    void request();
}

class _Adaptee {
    void specificRequest() {
        System.out.println("适配器操作");
    }
}

class ObjectAdapter implements _Target {
    private _Adaptee adaptee;

    ObjectAdapter(_Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
        System.out.println("其他操作");
    }
}