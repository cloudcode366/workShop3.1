package com.pack1;

/**
 * Hello world!
 *
 */
public class Tester {
    public static void main(String[] args) {
        Car c = new Car();
        c.pressStartButton();
        c.pressAcceleratorButton();
        c.output();
        Car c2 = new Car("red", 100, true, true);
        c2.pressAcceleratorButton();
        c2.setColour("black");
        System.out.println("Colour of c3:" + c2.getColour());
        c2.output();
    }
}
