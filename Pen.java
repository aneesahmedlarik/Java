public class Pen {
    String color;
    String type;//ball,pointer gel
Pen(String c,String t){
    type=t;
    color=c;
}
public void displayDetails(){
    System.out.println(color+" "+type);
}
    public static void main(String[] args) {
      Pen p1=new Pen("Red","gel");
      Pen p2= new Pen("Black","pointer");
p1.displayDetails();
p2.displayDetails();
    }}
