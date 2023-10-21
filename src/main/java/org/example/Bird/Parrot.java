package org.example.Bird;

public class Parrot extends Bird implements FlyAndSound{
    @Override
    public void fly() {
        System.out.println("Parrot is flying");
    }

    @Override
    public void makeSound() {
        System.out.println("Parrot is making sound");
    }
}
