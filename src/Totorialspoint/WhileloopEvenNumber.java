package Totorialspoint;

import java.util.Scanner;

public class WhileloopEvenNumber
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a number " );

        int n = Integer.parseInt(scanner.nextLine());

        int count = 0;

        while (count < 10)
        {

            if ( n % 2 == 0)
            {
                System.out.println(n);
                count++;
            }
            n++ ;
        }

    }
}
