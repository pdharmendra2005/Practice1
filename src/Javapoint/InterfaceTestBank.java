package Javapoint;

interface MyBank{
    float rateOfInterest();
}
class SbiBank implements MyBank{
    public float rateOfInterest(){
        return 9.15f;
    }
}
class PnbBank implements MyBank{
    public float rateOfInterest(){return 9.7f;}
}
class InterfaceTestBank{
    public static void main(String[] args){
        MyBank b=new SbiBank();
        System.out.println("ROI: "+b.rateOfInterest());
    }
}