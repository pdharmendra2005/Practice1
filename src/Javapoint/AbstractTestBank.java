package Javapoint;

abstract class RbiBank{

    abstract int rateOfInterest();

}
class SBI extends RbiBank{
    int rateOfInterest(){
        return 7;
    }
}
class PNB extends RbiBank{
    int rateOfInterest(){
        return 4;
    }
}


public class AbstractTestBank extends SBI{
    public static void main(String[] args) {
      RbiBank rbiBank;


       rbiBank = new AbstractTestBank();

        System.out.println(rbiBank.rateOfInterest());
        rbiBank = new PNB();
        System.out.println(rbiBank.rateOfInterest());


    }
}
