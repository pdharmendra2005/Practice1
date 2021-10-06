package SrikantTestingCoaching.Globalbank;

public class Supervisor {

    public static void main(String[] args) {
        NewCustomer Newc = new NewCustomer();

        Newc.age();
        Newc.nationality();

       // private method so can't excess Newc.nationality1();
        System.out.println(Newc.x);

    } 
}
