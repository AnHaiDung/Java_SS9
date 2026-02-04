package re.btvn.bai4;

import java.util.Scanner;

public class Dog extends Animal {
    @Override
    public void sound() {
        super.sound();
        System.out.println("Gau Gau");
    }
    public void fly(){
        System.out.println("bay");
    }
}
