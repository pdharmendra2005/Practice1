package Javapoint;

class ReturnthisTest {

    ReturnthisTest getA(){
        return this;
    }
    ReturnthisTest(){
        System.out.println("I am constructor");
    }

    void msg(){
        System.out.println("Return this testing");
    }
}
class ReturnthisMainTest{
    public static void main(String[] args) {
        new ReturnthisTest().getA().msg();
    }

}
