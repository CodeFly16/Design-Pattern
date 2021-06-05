package _19观察者模式;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        ConcreteSubject concreteSubject = new ConcreteSubject();
        ConcreteObserver1 observer1 = new ConcreteObserver1();
        ConcreteObserver2 observer2 = new ConcreteObserver2();
        concreteSubject.add(observer1);
        concreteSubject.add(observer2);
        concreteSubject.notifyObserver();
    }
}

interface Observer {
    void response();
}

class ConcreteObserver1 implements Observer {
    @Override
    public void response() {
        System.out.println("观察者1接收到提醒，做出相应改变。。。。");
    }
}

class ConcreteObserver2 implements Observer {
    @Override
    public void response() {
        System.out.println("观察者2接收到提醒，做出相应改变。。。。");
    }
}

abstract class Subject {
    protected List<Observer> observers = new ArrayList<Observer>();

    public void add(Observer observer) {
        observers.add(observer);
    }

    public void remove(Observer observer) {
        observers.remove(observer);
    }

    abstract void notifyObserver();
}

class ConcreteSubject extends Subject {
    @Override
    void notifyObserver() {
        System.out.println("具体目标发生改变...");
        System.out.println("--------------");

        observers.forEach(item -> {
            item.response();
        });
    }
}

