package Javapoint;

public class StaticVariableCube {

//Java Program to get the cube of a given number using the static method
    static int cube(int x){

        return x*x*x;
    }
    static int x= 10;
    static {
        System.out.println("static block is invoked...");
        System.out.println(x);
    }
    public static void main(String args[]){
        int result=StaticVariableCube.cube(5);
        System.out.println(result);
    }
}