package javacodegeeks;

public class LargestSmallestConstructor {

/*
   public LargestSmallestConstructor(int [] arr1){

       int val1 = arr1[0];
       int val2 = arr1[0];
       for (int j : arr1) {
           if (j > val1) {
               val1 = j;
           } else if (j < val2) {
               val2 = j;
           }
       }
       System.out.println(val1);
       System.out.println(val2);
   }
*/
public static int[] largestSmallestMethod(){

    int [] arr1 = new int [] { 15, 20,55,-4 };
    int val1 = arr1[0];
    int val2 = arr1[0];
    for (int j : arr1) {
        if (j > val1) {
            val1 = j;
        } else if (j < val2) {
            val2 = j;
        }
    }
    return arr1 ;

}



   public static void main(String[] args) {
        //LargestSmallestConstructor valueConstructor = new LargestSmallestConstructor(new int [] { 15, 20,55,-4 });
        int[] myList = largestSmallestMethod();
       System.out.println(myList);
    }


}
