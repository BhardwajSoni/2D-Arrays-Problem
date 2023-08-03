public class SearchEle {
    public static void print2D(int matrix[][],int n,int m){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                 System.out.print(matrix[i][j]+" ");
                
            }
            System.out.println();
         }
    }
    public static boolean searchEle(int matrix[][],int n,int m,int key){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==key){
                    System.out.println("Element is found");
                    return true;  //not return is alway run if key is found;
                }
                
            }
         }
         System.out.println("Element not found");
         return false;
    }
    public static void main(String[] args) {
        int matrix[][]={{1,5,8,6,9},{3,2,7,6,5},{1,4,7,2,3}};
        int n=matrix.length;
        int m= matrix[0].length;
        int key=2;
         print2D(matrix, n, m);
        //searchEle(matrix, n, m, key);
        System.out.println(searchEle(matrix, n, m, key));
       
    }
}
