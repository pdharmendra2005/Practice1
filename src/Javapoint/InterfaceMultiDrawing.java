package Javapoint;


interface Printable{
    void print();
}
interface Showable{
    void show();
}
class InterfaceMultiDrawing implements Printable,Showable{
    public void print(){System.out.println("Hello");}
    public void show(){System.out.println("Welcome");}

    public static void main(String args[]){
        InterfaceMultiDrawing obj = new InterfaceMultiDrawing();
        obj.print();
        obj.show();
    }
}