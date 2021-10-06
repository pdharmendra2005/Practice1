package Javapoint;


class Bank{
    float getRateOfInterest(){return 0;}
}
class MySBI extends Bank{
    float getRateOfInterest(){return 8.4f;}
}
class MyICICI extends Bank{
    float getRateOfInterest(){return 7.3f;}
}
class MyAXIS extends Bank{
    float getRateOfInterest(){return 9.777777777f;}
}
class RuntimePolymorphismTest{
    public static void main(String args[]){
        Bank b;
        b=new MySBI();
        System.out.println("SBI Rate of Interest: "+b.getRateOfInterest());
        b=new MyICICI();
        System.out.println("ICICI Rate of Interest: "+b.getRateOfInterest());
        b=new MyAXIS();
        System.out.println("AXIS Rate of Interest: "+b.getRateOfInterest());
    }
}