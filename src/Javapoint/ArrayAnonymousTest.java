package Javapoint;

public class ArrayAnonymousTest {

    static void printArray( int arr[]){

        for (int i=0; i< arr.length;i++)
            System.out.println(arr[i]);

    }

    public static void main(String[] args) {
        printArray( new int[]{4, 8, 10, 20});
    }
}
