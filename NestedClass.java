class Outer{
    int x=48;
    public void showOuter(){
        System.out.println("this is outer class.");
    Inner in=new Inner();// another method to call
    in.showinner();//by objecting in outer

    }
    class Inner{
        int y=2;
        public void showinner(){
            System.out.println(x+y);
        }
    }
}

public class NestedClass {
    public static void main(String[] args) {
        Outer out =new Outer();
        Outer.Inner in= out. new Inner();// another 2 syntax to call
        out.showOuter();                //  calling outer class to show its method
        in.showinner();                 //   calling inner class method to show the result.
    }

}
