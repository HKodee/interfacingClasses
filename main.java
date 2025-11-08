import java.util.*;

interface Animal {
    void makeSound();
    void eat();
    void sleep();
}

class Dog implements Animal {
    @Override
    public void makeSound(){
        System.out.println("Woof!");
    }

    @Override
    public void eat(){
        System.out.println("Dog is eating.");
    }

    @Override
    public void sleep(){
        System.out.println("Dog is sleeping.");
    }
}

public class main {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.makeSound();
        myDog.eat();
        myDog.sleep();
    }
}