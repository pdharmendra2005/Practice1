package Javapoint;


class Bike{
    final void run(){System.out.println("running...");}
}
class InheritFinalMethod extends Bike{
    public static void main(String args[]){
       // new Honda2().run();
        //InheritFinalMethod inheritFinalMethod = new InheritFinalMethod();
        //inheritFinalMethod.run();
        new InheritFinalMethod().run();
    }
}