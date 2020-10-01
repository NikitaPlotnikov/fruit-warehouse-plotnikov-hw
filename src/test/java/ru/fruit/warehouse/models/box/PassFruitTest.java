package ru.fruit.warehouse.models.box;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.fruit.warehouse.models.fruit.Apple;

public class PassFruitTest {
    @Test
    void passFruitTest(){
        Box<Apple> appleBox1 = new Box<>();
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        appleBox1.addToBox(apple1);
        appleBox1.addToBox(apple2);
        appleBox1.addToBox(apple3);
        Box<Apple> appleBox2 = new Box<>();
        Apple apple4 = new Apple();
        Apple apple5 = new Apple();
        Apple apple6 = new Apple();
        appleBox2.addToBox(apple4);
        appleBox2.addToBox(apple5);
        appleBox2.addToBox(apple6);
        appleBox1.passFruit(appleBox2);
        Assertions.assertEquals(appleBox2.amountOfFruit(),6);
        Assertions.assertEquals(appleBox1.amountOfFruit(),0);
    }

}
