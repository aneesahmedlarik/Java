class Stud{
    public void favSub(){
        System.out.println("favourite Subject__________");
    }

}
class Stud1 extends Stud{
    public void favSub(){
        System.out.println("student 1 likes english");
    }
}
class Stud2 extends Stud{
    public void favSub(){
        System.out.println("Student 2 likes oop");
    }

}
class Stud3 extends Stud{
    public void favSub(){
        System.out.println("student 3 likes Islamiyat");
    }
}


public class StudentFavSub {
    public static void main(String[] args) {
        Stud s= new Stud();
        s.favSub();
        Stud1 s1= new Stud1();
        s1.favSub();
        Stud2 s2= new Stud2();
        s2.favSub();
        Stud3 s3= new Stud3();
        s3.favSub();


    }
}
