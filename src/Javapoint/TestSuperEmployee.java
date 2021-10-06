package Javapoint;

class Person{
    String name;
    int id ;

    Person(String name, int id){
        this.name = name;
        this.id = id;
    }

}
class Emp extends Person{

    float salary;
    Emp(String name, int id, float salary){
        super(name,id);
        this.salary = salary;
    }
    void display(){
        System.out.println(name +" "+id +" " + salary);
    }
}

public class TestSuperEmployee {
    public static void main(String[] args) {
        //TestSuperEmployee testSuperEmployee = new TestSuperEmployee();
        //Emp emp = new Emp ("Dee Patel", 250 , 3000f);
        //emp.display();
        new Emp("Raam",300,2500f).display();
    }
}
