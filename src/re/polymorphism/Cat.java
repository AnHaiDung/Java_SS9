package re.polymorphism;

import java.util.Scanner;

public class Cat extends Animal{
    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Meo Meo");
    }
    public void catchMouse(){
        System.out.println("bat chuot");
    }
}
