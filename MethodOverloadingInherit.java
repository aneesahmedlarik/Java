class Methods{
    public void add (){
      int x,y,  z;
      x=4; y=5;
    z=x+y;
        System.out.println("addition is "+z);
    }
    public void add(double x, double y){
        double z;
        z=x+y;
        System.out.println(z);

    }

}




public class MethodOverloadingInherit {
    public static void main(String[] args) {
        Methods m = new Methods();
        m.add();
        m.add(5.55d,56.4);
    }
}
