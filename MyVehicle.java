import java.util.*;
class VehicleInfo{
    int no_of_seats, no_of_wheels;

    public void setNo_of_seats(int no_of_seats) {
        this.no_of_seats = no_of_seats;
    }

    public void setNo_of_wheels(int no_of_wheels) {
        this.no_of_wheels = no_of_wheels;
    }

    public void showVehicle(int no_of_seats, int no_of_wheels){
        if(no_of_wheels>2) {
            System.out.println("the car has " + no_of_wheels + " wheels & " + no_of_seats + " sitting capacity.");
        }
        else{
            System.out.println("the bike has " + no_of_wheels + " wheels & " + no_of_seats + " sitting capacity.");
        }
    }
}

public class MyVehicle {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    VehicleInfo car=new VehicleInfo();
        System.out.print("enter the vehicles tyres number. ");
      int no_of_wheels= sc.nextInt();
        car.setNo_of_seats(no_of_wheels);
    System.out.print("enter the vehicles seats. ");
    int no_of_seats= sc.nextInt();
    car.setNo_of_seats(no_of_seats);
    car.showVehicle(no_of_seats,no_of_wheels);
    }
}
