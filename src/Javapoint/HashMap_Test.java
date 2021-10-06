package Javapoint;

import java.util.HashMap;
import java.util.Map;

public class HashMap_Test{
    public static void main(String[] args){
        Map<String, String> objMap = new HashMap<String, String>();
        objMap.put("Type", "2-wheeler");
        objMap.put("Name", "Suzuki");
        objMap.put("Power", "220");
        objMap.put("Price", "85000");

        System.out.println("Elements of the Map:");
        System.out.println(objMap);

        Map<Integer, Integer> intMap = new HashMap<Integer, Integer>();

        intMap.put(10, 100);
        intMap.put(20, 200);
        intMap.put(30, 300);
        System.out.println("Element of the Map- Integer");
        System.out.println(intMap);


    }
}
