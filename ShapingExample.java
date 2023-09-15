package InterfaceExamples;
interface Shape{
    public void calculateArea();
    public void calculatePerimeters();
}
class Circle implements Shape{
    double radius;
    Circle (double radius){
        this.radius=radius;
    }

    @Override
    public void calculateArea() {
        System.out.println("the area of circle is "+ (Math.PI*radius*radius));
    }

    @Override
    public void calculatePerimeters() {
        System.out.println("the perimeters of the circle is "+(2*Math.PI*radius));
    }

}
class Rectangle implements Shape{
    double length, width;
    Rectangle( double length, double width){
        this.length=length;
        this.width=width;

    }

    @Override
    public void calculateArea() {
        System.out.println("the area of the rectangle is "+(length*width));
    }

    @Override
    public void calculatePerimeters() {
        System.out.println("the perimeters of rectangle is "+(2*(length+width)));
    }
}
class Triangle implements Shape{
    double height,base, per;
    Triangle(  double height,double base,double per){
        this.base=base;
        this.per=per;
        this.height=height;
    }

    @Override
    public void calculateArea() {
        System.out.println("the area of the triangle is "+((height*base)/2));
    }

    @Override
    public void calculatePerimeters() {
        System.out.println("the perimeter of triangle is "+(height+per+base));
    }
}
public class ShapingExample {
    public static void main(String[] args) {

        Shape c=new Circle(5);
        System.out.println("\n");
        c.calculateArea();
        c.calculatePerimeters();

        System.out.println("\n");

        Shape r= new Rectangle(6,12);
        r.calculateArea();
        r.calculatePerimeters();

        System.out.println("\n");

        Shape t= new Triangle(5,3,4);
        t.calculateArea();
        t.calculatePerimeters();
    }
}
