class calculation{
    int a,b;
public void calculation(int a,int b){
    this.a=a;
    this.b= b;

}
public void displaySum(calculation c){
    System.out.println("the addition is= "+(a+b));
}
}







public class ClassTask {
    public static void main(String[] args) {
        calculation c=new calculation();
        c.calculation(5,30);
        c.displaySum(c);
    }
}
