package javacodegeeks;

public class StringReverse {

    public static void main(String[] args) {
        String str = "Hello to Java World";

        String[] splitArray = str.split("");

        for (int i = splitArray.length-1; i >= 0 ; i--){
            System.out.print(splitArray[i]);
        }
    }
}
