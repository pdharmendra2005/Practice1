package Totorialspoint;

class Animal {
    public void move() {
        System.out.println("Animals can move");
    }
}

class Dog extends Animal {
    public void move() {
        System.out.println("Dogs can walk and run");
    }
    public void bark() {
        System.out.println("Dogs can bark");
    }
}
class DogSociety extends Dog {

   // Dog dg = new DogSociety();

    @Override
    public void move() {
        super.move();
    }

    @Override
    public void bark() {
        System.out.println("This is inside DogSociety");
    }
}
public class ExampleOverRidding {

    public static void main(String args[]) {
        Animal a = new Animal();   // Animal reference and object
        Animal b = new Dog();   // Animal reference but Dog object
        //DogSociety dg = new DogSociety();
        Dog dg = new DogSociety();
       // Animal dg = new DogSociety();

        dg.move();
        dg.bark();
        a.move();   // runs the method in Animal class
        b.move();   // runs the method in Dog class
        //b.bark();
    }
}