package javacodegeeks;

import java.util.ArrayList;
import java.util.List;

public class ListReturnTwoValue {

    public static void main(String[] args) {
       // something();
        List<Integer> numList = something();
        System.out.println(numList);
    }


    public static List something(){
        List<Integer> list = new ArrayList<Integer>();
        int number1 = 1;
        int number2 = 2;
        list.add(number1);
        list.add(number2);
        return list;
    }

}


