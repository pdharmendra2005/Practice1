package Javapoint;


//Java Program to demonstrate the use of a static method.
class Student11{
    int rollno;
    String name;
    static String college = "ITS";
    //static method to change the value of static variable
    static void change(){
        college = "BBDIT";
    }
    //constructor to initialize the variable
    Student11(int r, String n){
        rollno = r;
        name = n;
    }
    //method to display values
    void display(){System.out.println(rollno+" "+name+" "+college);}
}
//Test class to create and display the values of object
public class TestStaticMethod{
    public static void main(String args[]){
        //Student11.change();//calling change method
        //creating objects
        Student11 s1 = new Student11(111,"Karan");
        s1.display();
        Student11.change();
        Student11 s2 = new Student11(222,"Aryan");
        Student s3 = new Student(333,"Sonoo");
        //calling display method
        s1.display();
        s2.display();
        s3.display();
    }
}