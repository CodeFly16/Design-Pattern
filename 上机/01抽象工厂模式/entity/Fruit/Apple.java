package entity.Fruit;

import Fatory.Fruit;

public class Apple extends Fruit {
    private String name;

    public Apple(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        super.eat(this.name);
    }
}
