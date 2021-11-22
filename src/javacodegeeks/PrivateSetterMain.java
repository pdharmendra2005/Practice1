package javacodegeeks;

public class PrivateSetter
{
    private String name;
    public void setName(String s)
    {
        name = s;
    }
    public String getName()
    {
        return name;
    }
    public PrivateSetter(String name)
    {
        setName(name);
    }


    public void run()
    {
        PrivateSetter newDog = new PrivateSetter("John");
        nameThatDog(newDog);
        System.out.println(newDog.getName());
    }


    public void nameThatDog(PrivateSetter dog)
    {
        dog.setName("Rutger");
    }

    public static void main(String[] args) {
       // PrivateSetter privateSetter = new PrivateSetter();
    }
}