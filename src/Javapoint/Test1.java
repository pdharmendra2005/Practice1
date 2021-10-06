package Javapoint;


class A1{
    A1 getA(){
        return this;
    }
    void msg(){System.out.println("Hello java");}
}
class Test1{
    public static void main(String args[]){
        new A1().getA().msg();
    }
}