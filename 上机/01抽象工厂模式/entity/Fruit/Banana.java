package entity.Fruit;

import Fatory.Fruit;

public class Banana extends Fruit {
    private String name;

    public Banana(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        super.eat(this.name);
    }
}
