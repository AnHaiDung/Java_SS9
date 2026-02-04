package re.inherit;

import re.polymorphism.Animal;
import re.polymorphism.Caculator;
import re.polymorphism.Cat;
import re.polymorphism.Dog;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private int b;// bien instance chi ton tai khi ton tai doi tuong
    private static String name; // bien tinhx
    public static void main(String[] args) {
//        int a;
        Child child = new Child();
        child.say();
        child.say1();
        Caculator.sum(1,2);// bien dich thi se biet phuong thuc nao duoc goi
        Animal[] animals = new Animal[20];
        animals[0].makeSound();

//        Kieu khai bao va kieu thuc te
        Animal cat = new Cat();// kieu khai bao la Animal - Kieu thuc te: Cat , kieu thuc te se bi an di
        Animal dog = new Dog();
        Animal animal = new Animal();

//        Ep kieu ngam dinh/ ep kieu tuong minh
        Cat cat1 = new Cat();
        Animal ani = cat1; // ep kieu ngam dinh: tu con len cha
//        Toan tu instanceOf kiem tr kieu thuc te
        if(ani instanceof Cat){
            Cat cat2 = (Cat) ani; // ep kieu tuong minh -> Con co the sinh ra loi
        }
    }
    // TypeScript : Decorator
    public static void print(final int a,int b){

    }
}