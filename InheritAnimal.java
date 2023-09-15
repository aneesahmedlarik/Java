
class Vehicle {
    public void sound() {
        System.out.println("vehicle sound is_____");
    }}

class Car extends Vehicle {
    public void ModelCar(){
        System.out.println("model is Toyota Supra ");
    }
    public void sound(){
        System.out.println("supra says booombooomboooooooom");
    }
}


public class InheritAnimal {
    public static void main(String[] args) {
    Car c= new Car();
    c.ModelCar();
    c.sound();

    }
}
