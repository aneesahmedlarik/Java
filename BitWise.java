public class BitWise {
    public static void main(String[] args) {
        int a=12, b=25;
        int c,d,e,f;

        c=a|b;
        d=a&b;
        e=a^b;
        a=-12;
        f=~a;
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

        System.out.println(" "+(8>>>8));

    }

}
