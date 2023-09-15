class Rectangular{
    float l,w;
public void getData(float len,float width){

    l=len;
    w=width;
}
public float Rectformula(){
    float a;
    a=l*w;

return a;
}
}
public class RectangularCalculating {
    public static void main(String[] args) {
        Rectangular r1= new Rectangular();
        r1.getData(25.6f,60.3f);
        r1.Rectformula();
        Rectangular r2 = new Rectangular();
        r2.getData(40.45f,22.63f);
       float area =  r2.Rectformula();
        System.out.println(r1.Rectformula());
        System.out.println(r2.Rectformula());
    }
}
