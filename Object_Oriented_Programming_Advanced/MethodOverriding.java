package Object_Oriented_Programming_Advanced;

public class MethodOverriding {
    public static void main(String[] args) {
        Bike bike = new Bike();
        Car car = new Car();
        MotorBike moterBike = new MotorBike();

        bike.run();
        car.run();
        moterBike.run();
    }
}


class Vehicle {
    void run(){
        System.out.println("Vehicle is running");
    }
}

class Bike extends Vehicle{
    void run(){
        System.out.println("Bike is running");
    }
}

class Car extends Vehicle{
    void run() {
        System.out.println("Car is running");
    }
}

class MotorBike extends Vehicle {
    @Override
    void run() {
        System.out.println("MotorBike is running");
    }
}