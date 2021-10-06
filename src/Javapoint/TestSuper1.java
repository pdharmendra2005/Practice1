package Javapoint;

class Animal{
        String colour = "White";

        void eat(){
            System.out.println("White Dog is eating");
        }
    }
class Dog extends Animal {
    String colour = "Red";

    void eat() {
        System.out.println("Red Dog is eating");
        System.out.println("String in Dog is :" +colour);
        System.out.println("String in Animal is :" +super.colour);

    }
    void bark(){
        System.out.println("Red Dog is barking");
        //System.out.println(super.eat());
        super.eat();
    }
}
public class TestSuper1{
    public static void main(String[] args) {
        //TestSuper1 testSuper1 = new TestSuper1();
        Dog d = new Dog();
        d.bark();
        d.eat();

    }
}


