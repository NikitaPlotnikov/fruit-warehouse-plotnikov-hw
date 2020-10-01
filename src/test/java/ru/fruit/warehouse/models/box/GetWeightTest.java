package ru.fruit.warehouse.models.box;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.fruit.warehouse.models.fruit.Apple;

public class GetWeightTest {

    @Test
    void getWeightTest(){
        Box<Apple> appleBox = new Box<>();
        Apple apple = new Apple();
        appleBox.addToBox(apple);
        Assertions.assertEquals(apple.getWeight(),appleBox.getWeight());
    }
    @Test
    void getWeightTest2(){
        Box<Apple> appleBox = new Box<>();
        Apple apple = new Apple();
        Apple apple1 = new Apple();
        appleBox.addToBox(apple1);
        appleBox.addToBox(apple);
        Assertions.assertEquals(apple.getWeight() + apple1.getWeight(),appleBox.getWeight());
    }
}
