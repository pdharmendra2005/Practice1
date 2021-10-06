package javacodegeeks;

public interface ReverseNumberWhileLoopexample {

    static void main(String[] args) {

        // creating a input number type integer
        int inputNumber = 12345;

        // printing the input number
        System.out.println("Input Number : " + inputNumber);

        // creating a variable to hold the reversed value.
        int outputReversedNumber = 0;

        while (inputNumber != 0) {

            // taking last digit from number
            int lastDigit = inputNumber % 10;

            // adding last digit to the output value.
            outputReversedNumber = outputReversedNumber * 10 + lastDigit;

            // removing the last digit from number.
            inputNumber = inputNumber / 10;

        }

        // printing the output number after successful reversal.
        System.out.println("Reversed number : " + outputReversedNumber);

       /* Essentially, core logic is to take the last digit from input number and add it to the output number. After adding last digit to the output number then need to remove it from input number using inputNumber = inputNumber / 10; statement.

                Repeat the same logic until inputNumber is not 0. If this condition is failed then input is reversed.

                Finally, output number is having the completely reversed number.
*/

    }

}

