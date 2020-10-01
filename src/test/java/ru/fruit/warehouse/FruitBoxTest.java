package ru.fruit.warehouse;

import org.junit.jupiter.api.Test;
import ru.fruit.warehouse.models.box.Box;
import ru.fruit.warehouse.models.fruit.Apple;
import ru.fruit.warehouse.models.fruit.Orange;

class FruitBoxTest {

    @Test
    void addFruitBoxTest(){
        Box<Apple> appleBox = new Box<>();
        Apple apple = new Apple();
        appleBox.addToBox(apple);
        Box<Orange> orangeBox = new Box<>();
        Orange orange = new Orange();
        orangeBox.addToBox(orange);
    }

    @Test
    void getWeightTest(){
        Box<Apple> appleBox = new Box<>();
        Apple apple = new Apple();

        System.out.println(appleBox.getWeight());
    }

}
