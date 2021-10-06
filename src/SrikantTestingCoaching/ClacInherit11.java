package SrikantTestingCoaching;

public class ClacInherit11 {

    int num1;
    int num2;
    int total;
    int result;

    //public ClacInherit11(){}

    ClacInherit11(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;

    }
    public void addition11(){
        total = num1 + num2;
    }

    public void substraction11(){
        result = num1 - num2 ;
    }

    void display(){
        System.out.println("The addition of numbers is" +total);
        System.out.println("The substraction of numbers is" +result);

        }
}
