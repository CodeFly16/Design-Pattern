package entity.Vegetables;

import Fatory.Vegetables;

public class Tomato extends Vegetables {
    private String name;

    public Tomato(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        super.eat(this.name);
    }
}
