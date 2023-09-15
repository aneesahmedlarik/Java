class Worker{
    Worker(){
        System.out.println("this is default constructor.");
    }
    Worker(int x){
        System.out.println("salary of worker: "+ x);
    }
}

class Anees extends Worker{
    Anees(){
        System.out.println("this is constructor of Anees Class");
    }

    Anees(int x,int y){
       //parametrized constructors
        super(x);
        System.out.println("the value of y: "+y);
    }
}
class Ali extends Anees{
    Ali(){
        System.out.println("this is constructor for Ali");
    }
    Ali(int c){
        super();
        System.out.println("this is c "+c );
    }
}
class Jadu extends Ali{
    Jadu(){
        System.out.println("this is jadu constructor");
    }
    Jadu(int d){
        super(d);
        System.out.println("value for d:"+d);
    }
}



public class ConstructorInheritance {
    public static void main(String[] args) {
 //       Worker w=new Worker();
   Anees a=new Anees(2,3);
   Ali al=new Ali(25);
Jadu j= new Jadu(66);
    }
}
