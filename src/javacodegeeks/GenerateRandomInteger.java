package javacodegeeks;

import java.util.Random;

public class GenerateRandomInteger {

    public static void main(String[] args) {

        Random random1 = new Random();

        int randomValue1 = random1.nextInt();
        System.out.println(randomValue1);
        System.out.println(randomValue1);

        int randomvalue2 = random1.nextInt(100);
        System.out.println(randomvalue2);

        int randomvalue3 = random1.nextInt(5000);
        System.out.println(randomvalue3);

    }
}
