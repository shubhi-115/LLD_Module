package org.example;

import org.example.Bird.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
         FlyAndSound s = new Sparrow();
         s.fly();
         s.makeSound();
        MakeSound pen = new Penguin();
        pen.makeSound();
    }
}