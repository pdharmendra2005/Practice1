package javacodegeeks;



public class PrintLowerCaseAlphabets {

    public static void main(String[] args) {

        char firstChar= 'a';
        char lastChar = 'z';

       /* for ( char c = firstChar; c <= lastChar; c++ ){

            System.out.print(c + "  ");
        }*/
        char c = firstChar;
        while (c <= lastChar){

            System.out.print(c + " ");
            c++;
        }
    }

}
