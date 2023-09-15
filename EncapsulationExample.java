class Emp1{
    private int id; //data or members or field.
   private String name;

    public void setId(int id) {
        this.id = id;

    }

    public int getId() {
        return id;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}




public class EncapsulationExample {
    public static void main(String[] args) {
        Emp1 e1=new Emp1();
      e1.setId(25);
    e1.setName("Anees");
    e1.getId();
    e1.getName();
        System.out.println(e1.getId()+" "+ e1.getName());


    }
}
