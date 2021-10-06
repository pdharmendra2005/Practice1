
package SrikantTestingCoaching;

public class CalcInherit12 extends ClacInherit11{

    int num3;
    int num4;
    int total11;
    int result11;

    CalcInherit12(int num3, int num4) {
        super(num3, num4);
        this.num3 = num3;
        this.num4 = num4;
    }

    /* CalcInherit12(int number1, int number2){
         this.num3 = number1;
         this.num4 = number2;

     }  */
     void muntiplication(){
        total11 = num3 * num4;
    }

     void division(){
        result11 = num3 / num4 ;
    }

    void displayresult2(){
        System.out.println("The multiplication of numbers is" +total11);
        System.out.println("The division of numbers is" +result11);

    }

    public static void main(String[] args) {

        ClacInherit11 calcu11 = new ClacInherit11(200,100);
        CalcInherit12 calcu12 = new CalcInherit12(40, 20);
        calcu11.display();
        //calcu12.substraction11();
        //calcu12.muntiplication();
        //calcu12.division();
        calcu12.displayresult2();
    }
}
