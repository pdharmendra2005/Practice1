package Totorialspoint;

class Super_Calculation {
    int z;

    public void addition(int x, int y) {
        z = x + y;
        System.out.println("The sum of the given numbers:"+z);
    }

    public void Subtraction(int x, int y) {
        z = x - y;
        System.out.println("The difference between the given numbers:"+z);
    }
}

public class Sub_Calculation extends Super_Calculation {
    public void multiplication(int x, int y) {
        z = x * y;
        System.out.println("The product of the given numbers:"+z);
    }
    public int division(int x, int y){
        z= x/y ;
        return z;
    }

    public static void main(String args[]) {
        int a = 20, b = 10;
        //Super_Calculation demo = new Super_Calculation(); ok
        //Sub_Calculation demo = new Super_Calculation();
        Super_Calculation demo = new Sub_Calculation ();
        Sub_Calculation demo1 = new Sub_Calculation ();
        demo.addition(a, b);
        demo.Subtraction(a, b);
        //demo.multiplication(a, b); can't excess using SuperClass method
        demo1.addition(100, 200);
        demo1.multiplication(50,40);
        double d = demo1.division(40,200);
        System.out.println(demo1.division(200,10));
        System.out.println("demo1.division(40,200)"+ d);
    }

}