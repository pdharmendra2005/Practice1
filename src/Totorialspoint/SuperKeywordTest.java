package Totorialspoint;


class Superclass {
    int age;

    Superclass(int age) {
        this.age = age;
    }

    public void getAge() {
        System.out.println("The value of the variable named age in super class is: " +age);
    }
}

public class SuperKeywordTest extends Superclass {
    SuperKeywordTest(int age) {
        super(age);
       // System.out.println("Fired Constructor");
       // super.getAge();
    }

    public static void main(String args[]) {
        SuperKeywordTest s = new SuperKeywordTest(14);
        s.getAge();

    }
}