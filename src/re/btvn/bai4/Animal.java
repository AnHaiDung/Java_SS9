package re.btvn.bai4;

import java.util.Scanner;

public class Animal {
    public void sound(){

    }

    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal animal = new Dog();
        cat.sound();
        dog.sound();
        if(animal instanceof Dog){
            Dog dog2 = (Dog) animal;
            dog2.fly();
        }

    }
}
