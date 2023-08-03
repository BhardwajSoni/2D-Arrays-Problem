public class SpiralMatrix{
    public static void spiralMatrix(int matrix[][],int n,int m){
        int sRow=0;
        int eRow=n-1;
        int sCol=0;
        int eCol=m-1;

        while(sRow<=eRow && sCol <= eCol){
            //print top
            for(int j=sCol;j<=eCol;j++){
                System.out.print(matrix[sRow][j]+" ");
            }
            // right
            for(int i=sRow+1;i<=eRow;i++){
                 System.out.print(matrix[i][eCol]+" ");
            }
            //buttom
            for(int j=eCol-1;j>=sCol;j--){
                if(eRow==sRow){
                    break;
                }
                 System.out.print(matrix[eRow][j]+" ");
            }
            //left
            for(int i=eRow-1;i>=sRow+1;i--){
                if(eCol==sCol){
                    break;
                }
                 System.out.print(matrix[i][sCol]+" ");
            }
            sRow++;
            sCol++;
            eCol--;
            eRow--;
        }
    }

    public static void print2D(int matrix[][],int n,int m){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                 System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
         }
    }
    public static void main(String[] args) {
        int matrix[][]={{1,5,8},{3,2,9},{1,4,7},{1,4,7}};
        int n=matrix.length;
        int m= matrix[0].length;
        print2D(matrix, n, m);
        spiralMatrix(matrix, n, m);
    }
}