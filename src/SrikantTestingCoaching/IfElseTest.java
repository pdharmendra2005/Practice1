package SrikantTestingCoaching;

public class IfElseTest {

    public static void main(String[] args) {

        int x=10 , y= 30 , z = 50;

        if (x>y && x>z){

            System.out.println("x is the greatest number " +x);

        } else if ( y > x && y > z ){

            System.out.println("y is the greatest number " +y);
        } else {

            System.out.println("z is the greatest number " +z);
        }

    }
}
