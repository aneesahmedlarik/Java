package InterfaceExamples;
interface Vehicle1 {
    public void start();
    public void showDetail();


}
interface Vehicle2{
    public void sayhello();
}
class Car implements Vehicle1, Vehicle2 {
    @Override
    public void start() {
        System.out.println("car starts with self button");
    }

    @Override
    public void showDetail() {
        System.out.println("Car is toyota Supra red color");

    }

    @Override
    public void sayhello() {
        System.out.println("hello");
    }
}

class Bike implements Vehicle1, Vehicle2 {
    @Override
    public void start() {
        System.out.println("Bike starts with self button");
    }

    @Override
    public void showDetail() {
        System.out.println("Bike is HI-Speed Infinity");
    }

    @Override
    public void sayhello() {
        System.out.println("hello world");
    }
}



public class Example1 {
    public static void main(String[] args) {
     Car c=new Car();
     c.start();
     c.showDetail();
     c.sayhello();
     Bike b=new Bike();
     b.start();
     b.showDetail();

    }
}
