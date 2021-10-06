package Javapoint;

public class ArrayMinMainMethod {

    public static void main(String[] args) {

        int a[] = { 3, 7, 9, 23, 1, 6, -9};

        int min = a [0];

        for ( int i=0; i<a.length; i++){


            if(a[i]<=min){
                min = a[i];
            }
            //System.out.println(min);
        }
        System.out.println(min);
    }

}
