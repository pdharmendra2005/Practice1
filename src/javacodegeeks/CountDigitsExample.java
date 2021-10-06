package javacodegeeks;


public class CountDigitsExample {

    public static void main(String[] args) {

        // Input number
        int number = 12345;

        String numberInString = Integer.toString(number);

        int length = numberInString.length();

        // printing the output
        System.out.println("No of digits in number " + number + " is " + length);
        System.out.println(number/10);
        System.out.println(1 + number/10);
        System.out.println((1 + number/10)/10);
        System.out.println(1 + number/10);
    }
}
