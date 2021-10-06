package Javapoint;


class TinyAnimal{
    void eat(){System.out.println("animal is eating...");}
}
class TinyDog extends TinyAnimal{
    void eat(){System.out.println("dog is eating...");}
}
class RuntimePolymorphismDog extends TinyDog{
    //void eat(){System.out.println("dog is eating inside Runtime...");}

    public static void main(String args[]){
        TinyAnimal a=new RuntimePolymorphismDog();
        a.eat();
    }
}