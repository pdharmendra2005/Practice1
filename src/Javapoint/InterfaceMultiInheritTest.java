package Javapoint;

interface PrintableFrame{
    void print();
}
interface ShowableFrame extends PrintableFrame{
    void show();
}
class InterfaceMultiInheritTest implements ShowableFrame{
    public void print(){System.out.println("Hello");}
    public void show(){System.out.println("Welcome");}

    public static void main(String args[]){
        InterfaceMultiInheritTest obj = new InterfaceMultiInheritTest();
        obj.print();
        obj.show();
    }
}