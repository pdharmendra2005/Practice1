package javacodegeeks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import static java.util.Comparator.reverseOrder;

public class ArrayListReverseOrder1 {

    public static void main(String[] args) {

        // Creating ArrayList
      //  List <Integer> numbersList = new ArrayList<>();
        List <Integer> numbersList = new ArrayList<>();

        // Adding values to List
        numbersList.add(150);
        numbersList.add(50);
        numbersList.add(250);
        numbersList.add(500);
        numbersList.add(350);

        // printing before sorting
        System.out.println("Before sorting : " + numbersList);

//        String arrayString = numbersList.toString();
  //      System.out.println("String Array : " + arrayString);

      //  Stream <Integer> sortedArray = numbersList.stream().sorted();
        Comparator <Integer> reverseArray = Collections.reverseOrder();

        Collections.sort(numbersList,reverseArray);


        System.out.println("After Sorting " +numbersList);


    }

}
