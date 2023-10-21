package org.example.Bird;

import java.sql.SQLOutput;

public class Sparrow extends Bird implements FlyAndSound{

    @Override
    public void fly() {
        System.out.println("Sparrow is flying");
    }

    @Override
    public void makeSound() {
        System.out.println("Sparrow is making Sound");
    }
}
