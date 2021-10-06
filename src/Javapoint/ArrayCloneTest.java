package Javapoint;

public class ArrayCloneTest {

    public static void main(String[] args) {

        int arr[] = {3, 8, 10, 15};

        System.out.println("Original Array");
        for ( int i : arr)
            System.out.print(i + "  ");

        System.out.println(" ");
        System.out.println(" Printing Clone Array");

        int clo[] = arr.clone();

        for( int i : clo)
            System.out.print(i +"  ");

        System.out.println(" Are both equal");
        System.out.println(arr == clo);

    }
}
