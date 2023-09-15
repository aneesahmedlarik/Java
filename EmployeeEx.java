class worker{
    int yoj;
    String name,address;


}
public class EmployeeEx {

    public static void main(String[] args) {
worker w1=new worker();
w1.yoj=1994;
w1.name="Robert";
w1.address="64C-WallsStreet";
        worker w2 =new worker();
        w2.yoj=2000;
        w2.name="Sam";
        w2.address="68D-WallsStreet";
        worker w3 =new worker();
        w3.yoj=1999;
        w3.name="John";
        w3.address="26B-WallsStreet";


        System.out.println("Name \t\tYear of joining\t\tAddress");
        System.out.println(w1.name+"\t\t"+w1.yoj+"\t\t\t"+w1.address);
        System.out.println(w2.name+"   \t\t"+w2.yoj+"\t\t\t"+w2.address);
        System.out.println(w3.name+"  \t\t"+w3.yoj+"\t\t\t"+w3.address);
    }
}
