import java.util.*;

class Student{
    int age;
    String name;
    public void insertRecord(int a,String n){
        age =a;
        name=n;

    }
public void OutputData(){
    System.out.println(name+" is "+age);
}
}




public class Oop {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
Student s1=new Student();
        Student s2 =new Student();

s1.insertRecord(18,"Anees");
s2.insertRecord(17,"alpha");
s1.OutputData();
s2.OutputData();
         }
}
