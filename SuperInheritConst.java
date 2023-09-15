class A{
    A(){
        System.out.println("/ A constructor /");
    }
    A(int x){
        System.out.println("the value for x is = "+x);
    }




    public void showA() {
        System.out.println("this is method of class A");
    }
}
class B extends A{
public void showB(){

    System.out.println("/ B constructor method /");
}
B(int x, int y){
    super(x); //call immediate parent class constructor.
    System.out.println("the value of y = "+y);
}


}
class C extends B{
    C(int x, int y, int z) {
        super(x,y);
        super.showA();
        super.showB();
        System.out.println("the value for z= "+z);

    }


    public void showC() {
        System.out.println("class C method");
    }
}



public class SuperInheritConst {
    public static void main(String[] args) {
       //B b=new B(2,4);
        C c= new C(5,6,7);
   c.showC();
    }


}
