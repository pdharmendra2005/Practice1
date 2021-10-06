package Javapoint;

public class ArrayMinMethod {

    static void min ( int a[]){
        int min = a [0];
        for ( int i= 1; i< a.length; i++)
            if ( min > a [i])
                min = a [i];

        System.out.println(min);
    }
    public static void main(String[] args) {
        int arr[] = { 2 , 8, 10 , 5, 0, -6};
        min(arr);

    }
}
