package Javapoint;

interface MahindraBikeCompany{
    void chooseBikeModel();
}
abstract class BikeCompany implements MahindraBikeCompany, HondaCivicInterface{
    BikeCompany(){
        System.out.println("Bike is Created");
    }
    abstract void run();
    void changeGear(){
        System.out.println("Gear is Changed");
    }
    public void chooseBikeModel(){
        System.out.println("I choose Mahindra Scotty");
    }
    public void hondaCivic(){
        System.out.println("I choose HondaCivic Car");
        int hondaCivicPrice = 400007 ;
        System.out.println(hondaCivicPrice);
        System.out.println(hondaCivicPrice);
    }
}
class Honda extends BikeCompany {

    void run() {
        System.out.println("Honda is running");
    }
    void changeGear(){
        System.out.println(" Honda gear has changed");
    }

}
class Bajaj extends BikeCompany implements MahindraBikeCompany{
    void run(){
        System.out.println("Bajaj is running");
    }
    void changeGear(){
        System.out.println("Bajaj gear has changed");
    }
    int  BajajValue(){
        return 14000;
    }
}


public class AbstractTestBike {

    public static void main(String[] args) {
        BikeCompany bikeCompany = new Honda();
        bikeCompany.run();
        bikeCompany.changeGear();
        bikeCompany.chooseBikeModel();
        bikeCompany.hondaCivic();

        Bajaj bajaj = new Bajaj();
        bajaj.run();
        bajaj.changeGear();
        System.out.println("Price of bajaj is " +bajaj.BajajValue());
        bajaj.chooseBikeModel();

    }


}



