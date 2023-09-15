import java.util.*;
public class CompoundOperators {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("compounding operators\n\n");
        int a,b,c,d,e,f,g,h;
        a=50;
        b=40;
        c=54;
        d=85;
        e=20;
        f=40;
        g=30;
        h=15;
        int i=40;
        int j=3;

        System.out.print("a+=b from the numbers "+a +" "+b+" = ");
        a+=b;
        c-=d;
        System.out.println(c);
        System.out.print("a*=b from the numbers "+e +" "+f+" = ");
        e*=f;
        System.out.println(a);
        System.out.print("a-+=b from the numbers "+c +" "+d+" = ");
        System.out.println(e);
        System.out.print("a/=b from the numbers "+g +" "+h+" = ");
        g/=h;
        System.out.println(g);
        System.out.print("a%=b from the numbers "+i +" "+j+" = ");
        i%=j;
        System.out.println(i);

    }
}
