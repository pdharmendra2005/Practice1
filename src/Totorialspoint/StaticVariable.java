package Totorialspoint;

public class StaticVariable {

    // salary  variable is a private static variable
    private static double salary;

    // DEPARTMENT is a constant
    public static final String DEPARTMENT = "Development ";

    public static void main(String args[]) {
        //StaticVariable.salary = 1000 ;
        salary = 1000.55;
        System.out.println(DEPARTMENT + "average salary:" + salary);
    }
}