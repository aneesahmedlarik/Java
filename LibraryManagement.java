package Pack1;
class Item{

    String title;
    int year;
    Item(String title,int year){
        this.title=title;
        this.year=year;
    }
    public void displayDetail(){
        System.out.print(" \n item "+title+" from the year "+year);
    }
}
class Book extends Item{

Book(String title,int year,String author){
    super(title,year);
    super.displayDetail();
    System.out.print(" and the author is "+author);
}
}
class Dvd extends Item{

    Dvd(String title,int year,String director){
        super(title,year);
        super.displayDetail();
        System.out.print(" and the directors is "+director);
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
    Book b=new Book("forty rules of love",2015,"Elif Shafak");
    Dvd d= new Dvd("Avenger's Endgame",2019,"Anthony and Joe Russo");



    }
}
