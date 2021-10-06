package SrikantTestingCoaching.ACMPackage1;

public class ACMPrac1 {
    //Global variable
    int x = 500 , y = 300, z;
    String acmglobal = " Global String Variable";
    private int m = 50;

    public void addition(){
        int a = 20 , b = 45 , c ;
        c = x + a ;
        System.out.println(c);

    }
    public void substraction(){
        int a = 1000 , b = 2500 , c ;
        c = x + y + b - a ;
        System.out.println(c);
        System.out.println(acmglobal);
        System.out.println(m);

    }

    public static void main(String[] args) {
        ACMPrac1 acmin1 = new ACMPrac1();
        acmin1.addition();
        acmin1.substraction();
    }

}
