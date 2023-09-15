package InterfaceExamples;
interface Exp1{
    public void showA();
}

interface Exp2 extends Exp1{
    public void showB();
}

class A implements Exp2{
    @Override
    public void showA() {
        System.out.println("A method is Called");
    }

    @Override
    public void showB() {
        System.out.println("B method is Called");
    }
}

public class Example2 {
    public static void main(String[] args) {
      A a=new A();

        a.showA();
        a.showB();



    }

}
