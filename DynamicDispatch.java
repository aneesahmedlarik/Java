class mobile {
    public void on(){
        System.out.println("phone is on....");
        }
       public void showTime(){
           System.out.println("time is 2:18 PM ");
       }
}
class SmartPhone extends mobile{

    public void music(){
        System.out.println("music is playing....");
    }

    @Override
    public void on() {
        System.out.println("smart phone is on....");
    }
}
public class DynamicDispatch {
    public static void main(String[] args) {
        mobile m = new SmartPhone();     /*upcasting doubt in calling so runtime polymorphism makes us understands
                                           whether it calls the parent class method or sub_class method.*/
        m.on();

    }
}
