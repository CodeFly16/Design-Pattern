package FactoryImpl;

import Fatory.Fruit;
import Fatory.Vegetables;
import IFactory.BFruitAndVegetables;
import entity.Fruit.Banana;
import entity.Vegetables.Cabbage;

public class BConFV implements BFruitAndVegetables {
    @Override
    public Fruit CreateF() {
        Banana banana = new Banana("香蕉");
        return banana;
    }

    @Override
    public Vegetables CreateV() {
        Cabbage cabbage = new Cabbage("包菜");
        return cabbage;
    }
}
