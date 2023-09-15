package Abstraction;

abstract class Animal{
    abstract public void sound();
    abstract public void move();

}
class Dog extends Animal{
    String name;
    Dog(String name){
        this.name=name;
    }
    @Override
    public void sound() {
        System.out.println(name+" is barking");
    }

    @Override
    public void move() {
        System.out.println(name+" is walking ");
    }
}
class Bird extends Animal{
    String name;
    Bird(String name){
        this.name=name;
    }

    @Override
    public void sound() {
        System.out.println(name+" is making sound");
    }

    @Override
    public void move() {
        System.out.println(name+ "is flying");
    }
}



public class Example {
    public static void main(String[] args) {
       Dog d=new Dog("tommy");
       d.sound();
       d.move();
       Bird b=new Bird("sparrow");
b.sound();
b.move();



    }
}
