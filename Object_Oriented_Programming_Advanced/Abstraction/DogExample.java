package Object_Oriented_Programming_Advanced.Abstraction;

import java.sql.SQLOutput;

abstract class Animal {
    public String kind;
    public abstract void sound();
}
class Dog extends Animal {
    public Dog() {
        this.kind ="표유류";
    }

    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}

class Cat extends Animal {
    public Cat() {
        this.kind = "표유류";
    }

    @Override
    public void sound() {
        System.out.println("야옹");
    }
}

public class DogExample {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sound();

        Cat cat = new Cat();
        cat.sound();
    }
}
