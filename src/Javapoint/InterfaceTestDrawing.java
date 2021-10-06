package Javapoint;

interface Drawing {
    void draw();
}
class Ractangle implements Drawing{
    Ractangle(){
        System.out.println(" I am Ractangle Constructor");
    }
    public void draw(){
        System.out.println("Ractangle is drawing");
    }
    void getDrawing(){
        Drawing drawing = new Ractangle();
        drawing.draw();
    }
}
class Circle implements Drawing{
    Circle(){
        System.out.println(" I am Circle constructor");
    }
    public void draw(){
        System.out.println("Circle is drawing");
    }
        void getDrawing(){
        Drawing drawing2 = new Circle();
        drawing2.draw();
    }
}

public class InterfaceTestDrawing {

    public static void main(String[] args) {
        //InterfaceTestDrawing interfaceTestDrawing=new InterfaceTestDrawing();
        //Circle.getDrawing();
        new Circle().getDrawing();
        new Ractangle().getDrawing();

    }
}
