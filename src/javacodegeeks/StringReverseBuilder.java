package javacodegeeks;

public class StringReverseBuilder {

    public static String reverseString(String str){
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "Myname";
        String m = reverseString( s);
        System.out.println(m);
    }
}
