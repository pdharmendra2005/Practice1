package HowtodoinJava;

public class booleanLogical1 {


    public static int result = 20;

    public static void main(String[] args) {


        if (result > 10 && result < 30) {
            //some operation
            System.out.println(result);
        }

        if (result > 10 || result < 30) {
            //some operation
            System.out.println(result);
            System.out.println("//////////////revert-4-test branch between modified like after review comment"+result);
        }
    }
}
