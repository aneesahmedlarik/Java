class A3{
        String color= "red";

}
class B3 extends A3{
    String color="blue";

public void showB3(){
    System.out.println(color);
    System.out.println(super.color);
}
}
class C3 extends B3{
    String color="green";
    public void ShowC3(){
        System.out.println(color);
        System.out.println(super.color);
    }

}






public class SuperKeyword {
    public static void main(String[] args) {
        B3 b= new B3();
        b.showB3();
        C3 c=new C3();
        c.ShowC3();
    }


}
