package ru.fruit.warehouse.models.box;

import ru.fruit.warehouse.models.fruit.Fruit;

import java.util.Arrays;
import java.util.List;

public class Box <T extends Fruit> {

    private List<T> fruitBox;

    public List<T> getFruitBox() {
        return fruitBox;
    }

    public Box(T... fruitBox) {
        this.fruitBox = Arrays.asList(fruitBox);
    }

    public void addToBox(T fruit){
        fruitBox.add(fruit);
    }

    public Double getWeight(){
        Double sum = 0.0;
        for (T t : fruitBox){
            sum += t.getWeight();
        }
        return sum;
    }
}
