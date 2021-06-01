package FactoryImpl;

import Fatory.Fruit;
import Fatory.Vegetables;
import IFactory.AFruitAndVegetables;
import entity.Fruit.Apple;
import entity.Vegetables.Tomato;

public class AConFV implements AFruitAndVegetables {
    @Override
    public Fruit CreateF() {
        Apple apple = new Apple("苹果");
        return apple;
    }

    @Override
    public Vegetables CreateV() {
        Tomato tomato = new Tomato("番茄");
        return tomato;
    }
}
