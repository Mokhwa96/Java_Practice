package Object_Oriented_Programming_Advanced.instanceofTest;

public class InstanceOfExample {
    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println(animal instanceof Object);
        System.out.println(animal instanceof Animal);
        System.out.println(animal instanceof Bat);

        Animal cat = new Cat();
        System.out.println(cat instanceof Object);
        System.out.println(cat instanceof Object);
        System.out.println(cat instanceof Object);
    }
}

class Animal {};
class Bat extends Animal{};
class Cat extends Animal{};