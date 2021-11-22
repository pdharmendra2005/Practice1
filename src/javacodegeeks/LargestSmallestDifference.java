package javacodegeeks;

public class LargestSmallestDifference {

    public static void main(String[] args) {

        int[] result1 = minMaxArray1();
        int[] result2 = minMaxArray2();
        System.out.println(result1[0]+result2[0]);
        System.out.println(result1[1]+result2[1]);

    }

    public static int [] minMaxArray1 () {

            int[] arr = {28, -7, 15, 9, 17, 400, 230, 200, 500};

            int val1 = arr[0];
            int val2 = arr[0];
            for (int j : arr) {
                if (j > val1) {
                    val1 = j;
                } else if (j < val2) {
                    val2 = j;
                }
            }
            return new int[] {val1, val2} ;
    }

    public static int [] minMaxArray2 () {

        int[] arr = {30, -10, 5, 9, 37, 350, 130, 170, 400};

        int val1 = arr[0];
        int val2 = arr[0];
        for (int j : arr) {
            if (j > val1) {
                val1 = j;
            } else if (j < val2) {
                val2 = j;
            }
        }
        return new int[] {val1, val2} ;
    }

}

