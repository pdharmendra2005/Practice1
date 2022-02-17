package RahulShettyExercise;


public class HelloWorldWithoutStatic {


    public static HelloWorldWithoutStatic printMe(){
        System.out.println("HelloWorld");
        return HelloWorldWithoutStatic;
    }

    static HelloWorldWithoutStatic HelloWorldWithoutStatic = printMe();

    public static void main(String[] args) {


    }


}
