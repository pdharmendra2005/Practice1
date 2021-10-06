package RahulShettyExercise;


public class ConstructorDemo {
    // Default Constructor
    /*public ConstructorDemo() {
        System.out.println(" I am in the constructor");
        System.out.println(" I am in the constructor lecture 1");
    }*/
    // Parameterized constructor
    public ConstructorDemo(int a, int b) {
    System.out.println(" I am in the parameterized constructor");
    int c=a+b;
    System.out.println(c);
    }

    public ConstructorDemo(String str){
     System.out.println(str);
    }

    public void getdata(){
    System.out.println("I am the method");
    }
    //will not return values //name of constructor should be the class name


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ConstructorDemo cd = new ConstructorDemo(6,11);
        ConstructorDemo cds= new ConstructorDemo("hello");
        ConstructorDemo c= new ConstructorDemo(4,5);
        // compiler will call implict constructor
        // if you have not defined constructor block
        // when ever you create an object constructor is called
        // block of code when ever an object is created }

    }

}