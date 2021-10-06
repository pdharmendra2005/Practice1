package Javapoint;


//Java Program to create and call a default constructor
class Bike1{
    //creating a default constructor
    int i = 10;
    Bike1(){
        System.out.println("Bike is created");
        System.out.print("\n");
        System.out.println(i);
    }
    //main method
    public static void main(String args[]){
//calling a default constructor
        Bike1 b=new Bike1();
    }
}
