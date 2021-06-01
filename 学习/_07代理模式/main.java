package _07代理模式;

public class main {
    public static void main(String[] args) {
        Proxy proxy = new Proxy();
        proxy.Request();
    }
}

interface Subject {
    void Request();
}

class RealSubject implements Subject {

    @Override
    public void Request() {
        System.out.println("访问真实主题");
    }
}

class Proxy implements Subject {

    private RealSubject realSubject;

    private void preRequest() {
        System.out.println("访问真实主题前的预处理");
    }

    @Override
    public void Request() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        preRequest();
        realSubject.Request();
        postRequest();
    }

    private void postRequest() {
        System.out.println("访问真实主题前的后续处理");
    }

}
