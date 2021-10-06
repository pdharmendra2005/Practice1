package HowtodoinJava;


public class Data1 {

    public static void main(String[] args) {
        Data DT = new Data();

        System.out.println(DT.counter);
        System.out.println(DT.PI);
        //DT1.Data(5);
        DT.count(5);
        DT.count(5.35);
    }
    public void count(int counter1){

        System.out.println(counter1);
    }
    public void count(double counter1){

        System.out.println(counter1);
    }



}
