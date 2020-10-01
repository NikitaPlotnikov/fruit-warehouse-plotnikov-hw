package ru.fruit.warehouse.models.box;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.fruit.warehouse.models.fruit.Apple;
import ru.fruit.warehouse.models.fruit.Orange;

public class CompareTest {
    @Test
    void positiveCompareTest(){
        Box<Apple> appleBox = new Box<>();
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        appleBox.addToBox(apple1);
        appleBox.addToBox(apple2);
        appleBox.addToBox(apple3);
        Box<Orange> orangeBox = new Box<>();
        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        orangeBox.addToBox(orange1);
        orangeBox.addToBox(orange2);
        boolean actual= appleBox.compare(orangeBox);
        Assertions.assertTrue(actual);
    }
    @Test
    void negativeCompareTest(){
        Box<Apple> appleBox = new Box<>();
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        appleBox.addToBox(apple1);
        appleBox.addToBox(apple2);
        appleBox.addToBox(apple3);
        Box<Orange> orangeBox = new Box<>();
        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();
        orangeBox.addToBox(orange1);
        orangeBox.addToBox(orange2);
        orangeBox.addToBox(orange3);
        boolean actual= appleBox.compare(orangeBox);
        Assertions.assertFalse(actual);
    }
}
