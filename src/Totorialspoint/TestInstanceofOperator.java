package Totorialspoint;


class Animal1 {
}

class Mammal extends Animal1 {
}

class Reptile extends Animal1 {
}

public class TestInstanceofOperator extends Mammal {

    public static void main(String args[]) {
        Animal1 a = new Animal1();
        Mammal m = new Mammal();
        TestInstanceofOperator d = new TestInstanceofOperator();

        System.out.println(m instanceof Animal1);
        System.out.println(d instanceof Mammal);
        System.out.println(d instanceof Animal1);
    }
}