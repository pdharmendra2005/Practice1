package HowtodoinJava;

public class Honda4 extends Bike{

    void run() {
        System.out.println("running safely");
    }

    public static void main(String[] args) {
        Bike bikeObj = new Honda4();

        bikeObj.run();
    }
}
