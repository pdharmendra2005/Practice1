package HowtodoinJava;

public class booleanLogical1 {


    public static int result = 40;

    public static void main(String[] args) {


        if (result > 10 && result < 30) {
            //some operation
            System.out.println(result);
            result = result + 100 ;
            System.out.println("////////////// inside   "+ result);
        }
            System.out.println("//////////////outside   "+result);

            result = result + 500 ;

        if (result > 10 && result < 30) {
            //some operation
            System.out.println("////////////// another if   " + result);
        } else if (result > 3000 || result < 50) {

            System.out.println("result else if........." + result);
        } else {
            System.out.println("result in else only" + result);
//            origin/Sprint-111
        }
    }
}
