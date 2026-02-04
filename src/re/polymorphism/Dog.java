package re.polymorphism;

import java.util.Scanner;

public class Dog extends Animal {
    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Gau Gau");
    }
}
