package Javapoint;

//Java Program to illustrate the use of static variable which
//is shared with all objects.
class StaticCounter2{
    static int count=0;//will get memory only once and retain its value
    //int count = 0 ; //will get memory each time when the instance is created

    StaticCounter2(){
        count++;//incrementing the value of static variable
        System.out.println(count);
    }

    public static void main(String args[]){
//creating objects
        StaticCounter2 c1=new StaticCounter2();
        StaticCounter2 c2=new StaticCounter2();
        StaticCounter2 c3=new StaticCounter2();
    }
}