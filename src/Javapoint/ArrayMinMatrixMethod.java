package Javapoint;

public class ArrayMinMatrixMethod {

    static void minMatrix(int a [][] ) {

        //int a[][] = { {2,7,9},{23, 1, 45},{57, -500, 52}};
        // find a min from this matrix
        int min = a[0][0];

        for(int i=0; i < 3 ;i++){

            for(int j=0;j < 3; j++){
                if(a[i][j]<min)
                    min=a[i][j];
            }
        }
        System.out.println(min);
    }

    public static void main(String[] args) {
        int a[][] = { {2,7,9},{23, 1, 45},{57, -50, 52}};
        minMatrix(a);
    }

}
