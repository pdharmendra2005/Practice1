package Javapoint;

public class ArrayMatrixMinrawMaxColumn {

    public static void main(String[] args) {

        int a[][] = { {2,7,9},{23, 1, 45},{57, 5, 52}};
        // find a min from this matrix
        int min = a[0][0];
        int minColumn ;
        int maxColumn = 0;
        for(int i=0; i < 3 ;i++){

            for(int j=0;j < 3; j++){
                if(a[i][j]<min) {
                    min = a[i][j];
                    minColumn = j;
                }
            }
        }
        //System.out.println(min);
        int max = a[0][maxColumn];
        int k = 0;
        while(k>3){
            if ( a[k][maxColumn] > max){
                max = a[k][maxColumn];

            }k++;
        }
        System.out.println(max);
    }

}
