public class DiagonalSum {
    public static int diagonalSum(int matrix[][]){
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            sum+=matrix[i][i];
            if(i != matrix.length-1-i)
                sum+=matrix[i][matrix.length-1-i];
        }
        return sum;
    }
    public static void print2D(int matrix[][]){
        int n=matrix.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                 System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
         }
    }
    public static void main(String[] args) {
        int matrix[][]={{1,5,8,6},{3,2,7,6},{1,4,7,2},{1,2,3,4}};
        print2D(matrix);
        System.out.println(diagonalSum(matrix));
    }
}
