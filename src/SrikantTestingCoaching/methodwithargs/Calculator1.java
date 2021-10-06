package SrikantTestingCoaching.methodwithargs;

public class Calculator1 {

    public void addition(int a1, int a2){

        System.out.println("The addition of" +a1 +" & "+a2+" is :" +(a1+a2));

    }
    public void substraction(double d , double f){
        double r=d+f;
        //return r= d + f;
        System.out.println(r);
    }

    public void multiplication(int m1, int m2){
        String result = "The multiplicatin of " + m1 + " &" +m2 + "is :";
        int m3 = m1*m2 ;
        System.out.println(result +m3);

        this.addition(12, 250);

    }

    public static void main(String[] args) {
        Calculator1 cal1= new Calculator1() ;

        cal1.addition(20,30);
        cal1.substraction(3.55, 5.0);
        cal1.multiplication(250,200);
        //this.multiplication(100,150);
       // System.out.println(r);

    }

}
