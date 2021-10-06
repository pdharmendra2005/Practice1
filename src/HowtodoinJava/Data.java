package HowtodoinJava;

class Data {
    int counter = 20;
     Data(){

        System.out.println("I AM DATA CONSTRUCTOR");
        this.count(50.20);
    }
    static float PI = 3.14f;

    public void count(int counter1){

        System.out.println(counter1);
    }
    //Method over loading
    public void count(double counter1){

        System.out.println(counter1);
    }


}