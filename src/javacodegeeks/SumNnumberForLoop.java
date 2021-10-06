package javacodegeeks;

import java.util.Scanner;

public class SumNnumberForLoop {

    public static void main(String[] args) {

        System.out.println("Enter a number : ");
        Scanner scanner = new Scanner(System.in);

        int intValue = scanner.nextInt();
        int sum = 0;

        for ( int i=0;  i <= intValue ; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}