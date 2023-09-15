package Abstraction;

import java.util.Scanner;

abstract class Employees{
    abstract public double calculateSalary();
    abstract public void displayDetails();
}
class FullTimeEmployee extends Employees{
    String name;
    int psalary, days_worked;
   double salary;
    FullTimeEmployee(String name,int psalary,int days_worked){
        this.days_worked=days_worked;
        this.name=name;
        this.psalary=psalary;
    }

    @Override
    public double calculateSalary() {
    salary= psalary*days_worked;
    return salary;}

    @Override
    public void displayDetails() {
        System.out.println("the Full time Employee name is "+name);
        System.out.println("worked for "+days_worked+" days");
        System.out.println("salary will be given to employee is "+salary );
    }
}
class ParTimeEmployee extends Employees{
    String name;
    int hrs_wage, hrs_worked;
    double psalary;
    ParTimeEmployee(String name,int hrs_wage,int hrs_worked){
        this.hrs_worked=hrs_worked;
        this.name=name;
        this.hrs_wage=hrs_wage;
    }

    @Override
    public double calculateSalary() {
        psalary= hrs_wage*hrs_worked;
        return psalary;}

    @Override
    public void displayDetails() {
        System.out.println("the Part time Employee name is "+name);
        System.out.println("worked for "+hrs_worked+" days");
        System.out.println("salary will be given to employee is "+psalary );
    }
}

public class Employee {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter full time employees details please");
        System.out.print("name ?= ");
        String name=sc.next();
        System.out.print("per day salary?= ");
        int salary =sc.nextInt();
        System.out.print("days worked?= ");
        int days=sc.nextInt();


        System.out.println("enter part time employees details please");
        System.out.print("name ?= ");
        String pname=sc.next();
        System.out.print("per hour salary?= ");
        int psalary =sc.nextInt();
        System.out.print("hours worked?= ");
        int phrs=sc.nextInt();
        System.out.println("\n\ndetails for permanent employee. ");
        Employees fte= new FullTimeEmployee(name,salary,days);
        fte.calculateSalary();
        fte.displayDetails();
        System.out.println("\n\ndetails for temporary  employee. ");
Employees  pte= new ParTimeEmployee(pname,psalary,phrs);
pte.calculateSalary();
pte.displayDetails();
    }}