import java.util.*;

class EmployeeC{
    int id;
    String name;
    int sal;
    void  get_data(int i,String n, int s  ){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter name. ");
    n=sc.next();
    name =n;
        System.out.print("enter id. ");
    i=sc.nextInt();
    id=i;
        System.out.print("enter salary.");
s= sc.nextInt();
sal=s;
    }

    void outputData(){
        System.out.println(id+" "+name+" "+sal);
    }
}


public class Employee {
    public static void main(String[] args) {
        EmployeeC E1=new EmployeeC(); //making obj
        Scanner sc= new Scanner(System.in);
        int i,sal;
        String n;
        E1.get_data(1,"alpha",100); //passing dummy values to get access in method for inserting data invented by Anees
        E1.outputData();// prints output.
    }
}
