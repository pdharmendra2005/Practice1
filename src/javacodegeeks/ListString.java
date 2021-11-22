package javacodegeeks;


interface ListInterface{
    void printMe();
}
class ListString {
    static {
        System.out.println("Testing");
    }
    /*public static void main(String[] args) {
        List<String> list = Arrays.asList ("franz", "ferdinand", "fiel" ) ;

        final Supplier<String> stringSupplier = () -> list.get(2);

    }*/
}
class MyListString extends ListString implements ListInterface{
    public static void main(String[] args) {
        ListString listString = new ListString();
        System.out.println("In MyListString");

      MyListString myListString = new MyListString();
      myListString.printMe();

    }
    public void printMe() {
        System.out.println("I am interface");
    }

}