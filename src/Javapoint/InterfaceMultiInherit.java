package Javapoint;

interface Printable1{
    void print();
}
interface Showable1{
    void print();
}

class InterfaceMultiInherit implements Printable1, Showable1{
    public void print(){System.out.println("Hello");}
    public static void main(String args[]){
        InterfaceMultiInherit obj = new InterfaceMultiInherit();
        obj.print();
    }
}