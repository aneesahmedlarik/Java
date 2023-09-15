class Employee1{
   private int id;
    private String name;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;

    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
}

public class PrivateSpecifier {
    public static void main(String[] args) {
        Employee1 e1=new Employee1();
        e1.setName("Anees");
        e1.setId(329);
        System.out.println(e1.getId()+" "+e1.getName());

    }
}
