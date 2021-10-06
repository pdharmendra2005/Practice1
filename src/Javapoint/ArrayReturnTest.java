package Javapoint;

public class ArrayReturnTest {

    static int [] get(){

        return new int[]{10,25,45,55,60};
    }

    public static void main(String[] args) {
        int arr[]= get();

        for ( int i=0; i<arr.length; i++)
            System.out.print(arr[i] +"  ");
    }
}
