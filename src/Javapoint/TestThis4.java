package Javapoint;


class A{
    void m(){
        System.out.println("hello m");
    }
    void n(){
        System.out.println("hello n");
//m();//same as this.m()
        this.m();
    }
    static {
        System.out.println("hello I'm static ");

    }
}
class TestThis4{
    public static void main(String args[]){
        A a=new A();
        a.n();
    }}