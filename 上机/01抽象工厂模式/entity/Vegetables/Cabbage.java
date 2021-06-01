package entity.Vegetables;

import Fatory.Vegetables;

public class Cabbage extends Vegetables {
    private String name;

    public Cabbage(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        super.eat(this.name);
    }
}
