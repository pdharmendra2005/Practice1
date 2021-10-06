package Totorialspoint;

abstract class Bike{
    abstract void run();
}

public class AbstractHonda extends Bike{

    void run(){
    System.out.println("Bike is running");
    }

    public static void main(String[] args) {
        //Bike bike = new AbstractHonda();
        //bike.run();
        new AbstractHonda().run();
    }
}
