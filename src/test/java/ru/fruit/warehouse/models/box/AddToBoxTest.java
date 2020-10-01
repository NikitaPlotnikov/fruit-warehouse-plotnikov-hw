package ru.fruit.warehouse.models.box;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.fruit.warehouse.models.fruit.Apple;
import ru.fruit.warehouse.models.fruit.Orange;

class AddToBoxTest {

    @Test
    void addAppleToBoxTest() {
        Box<Apple> appleBox = new Box<>();
        Apple apple = new Apple();
        appleBox.addToBox(apple);
        Assertions.assertEquals(appleBox.amountOfFruit(), 1);
    }
    @Test
    void addOrangeToBoxTest() {
        Box<Orange> orangeBox = new Box<>();
        Orange orange = new Orange();
        orangeBox.addToBox(orange);
        Assertions.assertEquals(orangeBox.amountOfFruit(), 1);
    }
}