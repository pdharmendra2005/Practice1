package Totorialspoint;

public class DefaultConstructor {

    DefaultConstructor(String name) {
        // This constructor has one parameter, name.
        System.out.println("Passed Name is :" +name );
    }

    public static void main(String []args) {

        // Following statement would create an object myPuppy
        DefaultConstructor myPuppy = new DefaultConstructor( "Dee");
    }
}
