package Javapoint;

public class ArrayTest1 {
    public static void main(String[] args) {

        int [] a = new int [5];
        a [0] = 5;
        a [1] = 10;
        a [2] = 20;
        a [3] = 30;
        a [4] = 40;
        //a [5] = 50;

        for (int i= 0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.print('\n');
        System.out.println( a[4]);
    }


}
