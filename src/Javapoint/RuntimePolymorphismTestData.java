package Javapoint;


class Bike11{
    int speedlimit=90;
}
class RuntimePolymorphismTestData extends Bike11 {
    int speedlimit = 150;

    public static void main(String args[]) {
        Bike11 obj = new RuntimePolymorphismTestData();
        System.out.println(obj.speedlimit);//90
    }

}