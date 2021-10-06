package Javapoint;

public class StringLiteralTest {

    public static void main(String[] args) {

        String m = " My Trial";
        System.out.println(m.length());
        System.out.println(m);
        System.out.println(m.trim());
        System.out.println(m.length());
        System.out.println(m.indexOf(6));
        System.out.println(m.indexOf("r"));
        System.out.println(m.substring(2,6));
        String sp[] = m.split("T");
        System.out.println(sp[0]);
        System.out.println(sp[1]);

        String s = "India";
        for ( int i=s.length()-1; i>=0 ; i--){

            System.out.println(s.charAt(i));
        }
       /* String t = "" ;

        for ( int i=s.length()-1; i>=0; i--) {

            t = t + s.charAt(i);
        } */
        //System.out.println(t);
    }
}
