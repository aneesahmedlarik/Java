package Abstraction;
abstract class Vehicle{
    int no_of_wheels;
    abstract void start(); //abstract method must be in abstract class
}
class Car extends Vehicle{
    @Override
    void start() {
        System.out.println("car starts with key and has "+ no_of_wheels+" wheels.");
    }
}
class Bike extends Vehicle{
    @Override
    void start() {
        System.out.println("bike start with kick and has "+no_of_wheels+" wheels.");
    }
}

public class MainAbstraction {

    public static void main(String[] args) {
       Car c =new Car();
       c.no_of_wheels=4;
        c.start();

        Bike B = new Bike();
        B.no_of_wheels=2;
        B.start();
        }
    }








