package javacodegeeks;

public class StringSubstring {

   public static void main(String[] args){
    String value ="dee";
    String value2="I Love My India";

    String [] array =value2.split(" ");
    int length =array.length;

    for(int i=0;i<=length-1;i++){

        if(value.equalsIgnoreCase(array[i])){
            System.out.println("given string is substring of another string");
            break;
        }

    }System.out.println("Given string is not substring of another string ");
   }
}
