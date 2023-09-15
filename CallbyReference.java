class test1{
    int a,b;
    test1(int i,int j){
        a=i;
        b=j;
    }
    public void meth(test1 ob){
        ob.a=2;
        ob.b=4;
    }
}


public class CallbyReference {
    public static void main(String[] args) {
        test1 ob=new test1(15,20);
        System.out.println(ob.a+" "+ob.b);
        ob.meth(ob);
        System.out.println(ob.a+" "+ob.b);
    }
}
