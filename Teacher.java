class TeacherI {
    TeacherI(){
        System.out.println("this is default conscrtuter");
    }
    String colour=" black";
}
class CP extends TeacherI {
    CP(){
        System.out.println("this is default conscrtuter");
    }
    String colour=" brown";
}
class SP extends CP {
    String colour= "White";
SP(){
    System.out.println("sp color is "+colour);
    System.out.println("sp color is (super) "+(super.colour));
}
}


public class Teacher {
    public static void main(String[] args) {
        SP n= new SP();


    }
}
