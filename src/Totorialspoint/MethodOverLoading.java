package Totorialspoint;

public class MethodOverLoading {

    public static int minFunction( int n1, int n2 ){
        int min;
        if ( n1 > n2)
            min = n2;
        else min = n1;

        return min;
    }

    public static double minFunction( double d1, double d2){
        double min;
        if ( d1 > d2)
            min = d2 ;
        else min = d1;

        return min;

    }

    public static void main(String[] args) {

        int result1 = MethodOverLoading.minFunction(15, 35);

        double result2 = MethodOverLoading.minFunction(32.55, 50.58);

        System.out.println("Min Value Integer is " + result1+ "\nMin Double Value is " +result2);
    }
}
