class Test{
    public void displayResult(int x,int y){
        x=654;
        y=546;
    }
}





public class CallByValue {
    public static void main(String[] args) {
        Test t=new Test();
        int a=3;
        int b=4;
        System.out.println(a+" "+b);
        t.displayResult(a,b);
        System.out.println(a+" "+b);
    }
}
