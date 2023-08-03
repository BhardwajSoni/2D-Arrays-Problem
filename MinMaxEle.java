 
public class MinMaxEle {
    public static void maxele(int matrix[][],int n,int m){
        int large=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(large<matrix[i][j]){
                    large=matrix[i][j];
                }
                if(min>matrix[i][j]){
                    min=matrix[i][j];
                }
            }
            
         }
         System.out.println("maximum element of matrix is:"+large);
         System.out.println("minimum element of matrix is:"+min);
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
        int matrix[][]={{1,5,8,6,9},{3,2,7,6,5},{1,4,7,2,3}};
        int n=matrix.length;
        int m= matrix[0].length;
        print2D(matrix, n, m);
        maxele(matrix, n, m);
    }
}
