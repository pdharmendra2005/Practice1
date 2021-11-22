package javacodegeeks;

public class LargestValueArray {

    public static void main(String[] args){

        int[] arr={28,-3,15,9,17,400,230,200, 560};

        int val1=arr[0];
        int val2 = arr[0];
        for (int j : arr) {
            if (j > val1) {
                val1 = j;
            }else if (j < val2){
                val2 = j;
            }
        }
        System.out.println("Largest value in the Given Array is "+ val1);
        System.out.println("smallest value in the Given Array is "+ val2);
    }
}
/*
for(int i=0; i<arr.length; i++){
        if(arr[i] > val){
        val=arr[i];
        }
*/
