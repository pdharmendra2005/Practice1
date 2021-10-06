package Javapoint;


public class ExceptionTest {

    public static void main(String[ ] args) {

       

       try {
           int[] myNumbers = {1, 2, 3};
           System.out.println(myNumbers[10]); // error!
       }
       catch (Exception e){
           System.out.println("Something went wrong");
           System.out.println(e.getMessage());

       }
       finally {
           System.out.println("Try and Catch finished");
       }
    }
}