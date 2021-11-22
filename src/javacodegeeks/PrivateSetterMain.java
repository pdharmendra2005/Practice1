package javacodegeeks;

public class PrivateSetterMain {

    public static void main(String[] args) {
        PrivateSetterMain privateSetterMain = new PrivateSetterMain();
       // privateSetterMain.run();
    }
private static class SetterInside {

    private String name;

    public void setName(String s) {
        name = s;
    }

    public String getName() {
        return name;
    }

    public SetterInside(String name) {
        setName(name);
    }


    public void run() {
        SetterInside newDog = new SetterInside("John");
        nameThatDog(newDog);
        System.out.println(newDog.getName());
    }


    public void nameThatDog(SetterInside dog) {
        dog.setName("Rutger");
    }


}

}