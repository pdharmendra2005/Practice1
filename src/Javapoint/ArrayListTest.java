package Javapoint;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Volvo");
        arrayList.add("Opel");
        arrayList.add("Maruti");

        for (String i : arrayList)
            System.out.println(i);

         arrayList.add(3,"Suzuki");
        System.out.println("After Adding");
        for (String i : arrayList)
            System.out.println(i);

        System.out.println("After Sorting");
        Collections.sort(arrayList);
        for (String i : arrayList)
            System.out.println(i);


    }
}
