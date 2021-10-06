package Javapoint;

public class ArrayJaggedTest {

    public static void main(String[] args) {
        int arr [][]= new int [3][];

        arr[0]= new int[3];
        arr[1]= new int[6];
        arr[2]= new int[5];

        int count = 0;
        for ( int i =0 ; i<arr.length; i++){

            for ( int j= 0; j < arr[i].length; j++)
                arr[i][j] = count++;

            for ( int n=0 ; n<arr.length; n++)
                for ( int j=0 ; j < arr[j].length; j++)
                    System.out.println(arr[i][j] + "  ");
        }

    }
}
