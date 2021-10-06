package javacodegeeks;


import java.util.Scanner;

public class SumOfTwoNumbersWithOutPlusOperator {


    public static void main(String[] args) {

        // reading input from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number : ");

        int input1 = scanner.nextInt();

        System.out.println("Enter Second Number : ");

        int input2 = scanner.nextInt();

        int output = input1 - ( - input2);
        System.out.println(output);


    }

}
