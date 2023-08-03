 
import java.util.Scanner;

public class TwoArray{
    public static void twoArray(int matrix[][],int n,int m){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                 System.out.print(matrix[i][j]+" ");
                
            }
            System.out.println();
         }
    }
     public static void main(String[] args) {
        //initionlazation of array
        int matrix[][]=new int[3][3];
        int n=matrix.length;//length of row or no. of rows
        int m= matrix[0].length;//no. of column
        //////element by user input
         Scanner s= new Scanner(System.in);
         ///loop
         for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=s.nextInt();

            }
         }
         twoArray(matrix, n, m);
         s.close();
     }
     
}