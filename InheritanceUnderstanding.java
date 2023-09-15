class Animal{
    public void eat(){
        System.out.println("eating");
    }

}
class Cat extends Animal{  //provides access to upper class it inherits the subclass to main class.
    public void sound(){
        System.out.println("cat says meow meow");
    }

}
class Kittle extends Cat{ //multi-level inheritance
    public void weep(){
        System.out.println("kitle is weeping");
    }
}
class Dog extends Animal{
    public void bark(){
        System.out.println("dog says bhow");
    }
}

public class InheritanceUnderstanding {
    public static void main(String[] args) {
      Kittle k= new Kittle();//multi level inheritance
        k.sound();
        k.eat();
        k.weep();
        Dog d= new Dog();// hierarchical inheritance
        d.bark();
        d.eat();
    }
}


