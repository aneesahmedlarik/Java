class Student1{
    public void write(){
        System.out.println("student is writing");
    }

}
class Student5 extends Student1{

    @Override
    public void write() {
        super.write();
    }
}


public class MethodOverRiding {
    public static void main(String[] args) {
        Student5 s2=new Student5();
        s2.write();

    }
}
