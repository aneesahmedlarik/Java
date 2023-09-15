
package Abstraction;

import java.util.Scanner;

abstract class Shape{
    abstract void calculateArea();
   final float pi=3.14f;
      float rad;
float len,width;
}
class Circle extends Shape{
        @Override
        void calculateArea() {
        System.out.println("area of Circle is= "+(pi*rad*rad));

    }
}

class Rectangle extends Shape{
         @Override
         void calculateArea() {
        System.out.println("area of rectangle is= "+(len*width));
    }
}

public class TASKCLASS {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Circle c =new Circle();
        System.out.print("enter radius of circle= ");
        c.rad= sc.nextFloat();
        c.calculateArea();

        System.out.print("enter length of rectangle= ");
        Rectangle r=new Rectangle();
        r.len= sc.nextFloat();

        System.out.print("enter width of rectangular= ");
        r.width= sc.nextFloat();
        r.calculateArea();
    }
}
