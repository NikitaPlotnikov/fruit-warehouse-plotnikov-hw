package ru.fruit.warehouse.models.box;

import ru.fruit.warehouse.models.fruit.Fruit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box <T extends Fruit> {

    private List<T> fruitBox;


    public Box(T... fruitBox) {
        this.fruitBox = new ArrayList<>(Arrays.asList(fruitBox));
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

    public boolean compare(Box<?> box){
        double sum1 = getWeight();
        double sum2 = box.getWeight();
        if (sum1 == sum2){
            return true;
        }else {
            return false;
        }
    }

    public void passFruit(Box<T> box){
        for (T t :fruitBox){
            box.addToBox(t);
        }
        fruitBox.clear();
    }
    public int amountOfFruit(){
        int amountOfFruit = fruitBox.size();
        return amountOfFruit;
    }

    public List<T> getFruitBox() {
        return fruitBox;
    }


}
