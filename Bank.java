 class BankDataOfInterest{ //making it final prohibits to inherit the class
    public float getRateOfInterest(){ //making it final prohibits to inherit the method
    float rate=0;
   return rate ;}
}
class Mezaan extends BankDataOfInterest{
    @Override
    public float getRateOfInterest() {
       // float rate =8;
        return  8.0F;
    }
}
class Allied extends BankDataOfInterest{
    @Override
    public float getRateOfInterest() {
        //float rate = 9;
        return 9.0f;
    }
}
class National extends BankDataOfInterest{
    @Override
    public float getRateOfInterest() {
       //float rate =7;
        return 7.0f;
    }
}



public class Bank {
    public static void main(String[] args) {
        Mezaan me=new Mezaan();
       float getrate= me.getRateOfInterest();

        System.out.println("interest rate of meezan is= "+getrate);

        Allied ad=new Allied();
        float getrateA= ad.getRateOfInterest();

        System.out.println("interest rate of Allied is= "+getrateA);

        National n =new National();
        float getrateN = n.getRateOfInterest();

        System.out.println("interest rate of National is= "+ getrateN);

    }

}
