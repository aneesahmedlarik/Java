package Pack1;
class Product{
    String name;
    double price;
    public double CalculateDiscount(){
        System.out.print("discounted price for the product "+name+" is: ");
    return 0.0;
    }
}
class Electronics extends Product {
    String name;double price;
    Electronics(String name, Double price) {
        this.name=name;
        this.price= price;
    }
        @Override
        public double CalculateDiscount () {
            System.out.print("discounted price for the product "+name+" is: ");
            return price * 0.9;

        }}
class Clothing extends Product {
    String name;double price;
    Clothing(String name, Double price) {
        this.name=name;
        this.price= price;
    }
                @Override
            public double CalculateDiscount() {
                    System.out.print("\ndiscounted price for the product "+name+" is: ");
                return price * 0.8;
            }
        }

public class ShoppingSystem {
    public static void main(String[] args) {
        Electronics e = new Electronics("headphone ",1000d);
    double a=  e.CalculateDiscount();
        System.out.print(a);
      Clothing c= new Clothing(" Shervani",5000d);
    double b= c.CalculateDiscount();
        System.out.print(b);
    }
}
