class demo{
    int age;
    String name;

    public void displayInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}



public class Thisdemo {
    public static void main(String[] args) {
        demo d1=new demo();
       d1.age=18;
       d1.name= "Anees";
        demo d2 =new demo();
        d2.age=17;
        d2.name= "Ahmed";
d1.displayInfo();
d2.displayInfo();
    }
}
