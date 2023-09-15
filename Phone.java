import java.util.*;

class PhoneFeatures {
    Scanner sa= new Scanner(System.in);
    private String imei,simCard,processor;
    private int i_memory;
    boolean IsDualsim;
    PhoneFeatures(String imei, String SimCard, String processor, int i_memory, boolean isDualsim){

        this.imei = imei;
        this.simCard = simCard ;
        this.IsDualsim = IsDualsim;
        this.i_memory = i_memory;
        this.processor = processor;
    }
    public String getImei() {
        return imei;
    }

    public String getProcessor() {
        return processor;
    }

    public String getSimCard() {
        return simCard;
    }

    public int getI_memory() {
        return i_memory;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }


    public void setSimCard(String simCard) {
        this.simCard = simCard;
    }

    public void setI_memory(int i_memory) {
        this.i_memory = i_memory;

    }
    public  void DialNumber(){
        System.out.println("enter number. ");
        String number=sa.next();
        System.out.println("Dialing number...." +number);

    }
    public void receiveCall(){
        System.out.println("enter number.");
        String number= sa.next();
        System.out.println("Incoming call from:"+number);

    }
    public void sendSms(){
        System.out.println("enter number.");
        String number=sa.next();
        System.out.println("enter sms");
        String sms=sa.next();
        System.out.println("sending sms to "+number+  " "+ sms);

    }
    public void ReceiveSms(){
        System.out.println("enter number.");
        String number=sa.next();
        System.out.println("enter sms");
        String sms=sa.next();
        System.out.println("receive sms from this number:"+ number+ " " +sms);
    }
}
public class Phone {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter phones imei.");
        String i=sc.next();
        System.out.print("sim type? ");
        String s=sc.next();
        System.out.print("processor ?");
        String p=sc.next();
        System.out.print("internal memory?");
        int m=sc.nextInt();
        boolean b=true;
        System.out.println("possess dual sim card?"+ b);
        PhoneFeatures phone1 = new PhoneFeatures(i, s, p, m, b);
        System.out.println("What do you want?");
        System.out.println("1. make a call.");
        System.out.println("2. receive call.");
        System.out.println("3. send an sms.");
        System.out.println("4. receive an sms.");
      byte ch=sc.nextByte();

      switch (ch){
          case 1: phone1.DialNumber();
          break;
          case 2: phone1.receiveCall();
          break;
          case 3: phone1.sendSms();
          break;
          case 4: phone1.ReceiveSms();
          break;
          default:
              System.out.println("invalid input. choose again.");
          break;
      }}}
