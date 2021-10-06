package Javapoint;


class Block1{
    Block1(){
        System.out.println("parent class constructor invoked");
    }
}

class TestInstanceBlock extends Block1{
    TestInstanceBlock(){
        super();
        System.out.println("child class constructor invoked");
    }

    TestInstanceBlock(int a){
        super();
        System.out.println("child class constructor invoked "+a);
    }

    {System.out.println("instance initializer block is invoked");
    //System.out.println("instance initializer block 222 is invoked");
    }

    public static void main(String args[]){
        TestInstanceBlock b1=new TestInstanceBlock();
        TestInstanceBlock b2=new TestInstanceBlock(10);
    }
}