package _08适配器模式;

public class TwoWayAdapterTest {
    public static void main(String[] args) {
        System.out.println("目标通过双向适配器访问适配者：");
        TwoWayAdaptee adaptee=new AdapteeRealize();
        TwoWayTarget target=new TwoWayAdapter(adaptee);
        target.request();
        System.out.println("-------------------");
        System.out.println("适配者通过双向适配器访问目标：");
        target=new TargetRealize();
        adaptee=new TwoWayAdapter(target);
        adaptee.specificRequest();
    }

}

interface TwoWayTarget {
    void request();
}

interface TwoWayAdaptee {
    void specificRequest();
}

class AdapteeRealize implements TwoWayAdaptee {

    @Override
    public void specificRequest() {
        System.out.println("适配者代码被调用！");
    }
}

class TargetRealize implements TwoWayTarget {

    @Override
    public void request() {
        System.out.println("目标代码被调用！");
    }
}

class TwoWayAdapter implements TwoWayTarget, TwoWayAdaptee {

    private TwoWayAdaptee adaptee;
    private TwoWayTarget target;

    public TwoWayAdapter(TwoWayAdaptee adaptee) {
        this.adaptee = adaptee;
    }

    public TwoWayAdapter(TwoWayTarget target) {
        this.target = target;
    }

    public void request() {
        adaptee.specificRequest();
    }

    public void specificRequest() {
        target.request();
    }
}