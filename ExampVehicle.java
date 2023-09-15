package InheritanceTasks;

class Vehicle{
    String maker;
    String model;
    int year;
    Vehicle(String make, String modelof, int yearof){
       // make = this.maker;
        maker=make;
        model= modelof;
        year= yearof;
    }
    void getInformation(){
        System.out.print("model is "+model+" make model varient is "+maker+" manufactured in the year= "+year);
    }
}


class Car extends Vehicle{
   int no_of_door;
    Car(String make, String model, int year,int  no_of_door) {
        super(make, model, year);
        this.no_of_door=no_of_door;

        }

       void  getInformation(){
          super.getInformation();
           System.out.println(" and no_of_doors "+no_of_door);

}}

class MotorCycle extends Vehicle{
    float engineDisplacement;
    MotorCycle(String make, String model, int year,float engineDisplacement ) {
        super(make, model, year);
        this.engineDisplacement=engineDisplacement;

    }
public void getInformation()
{


    super.getInformation();
    System.out.println(" and enginedisplament"+engineDisplacement);

}

    }


public class ExampVehicle {
    public static void main(String[] args) {
        Vehicle v = new Vehicle("toyota","Supa",2023);
        Car c= new Car("toyota "," Supra",2022, 2);
        MotorCycle m = new MotorCycle("Suzuki","HR2",2015, 7.5888F );
        System.out.println(" Vehicle info");
        v.getInformation();
        System.out.println(" \ncar info");
        c.getInformation();
        System.out.println( "MOTORCYCLE");
        m.getInformation();




    }
}
