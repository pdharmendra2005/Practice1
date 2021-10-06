package Javapoint;

public class ArrayMultidimenTest {

    public static void main(String[] args) {
        int arr[][] = { { 2,5,8},{ 9,11,18},{ 25,40,55} };

        for( int i=0;i < 3; i++){
            for ( int j=0; j <3; j++)
                System.out.print(arr[i][j] + "    ");
            System.out.println();
        }
       // System.out.println();
    }
}
