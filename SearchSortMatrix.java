public class SearchSortMatrix {
    ////sorted matrix ---O(m+n)
    public static boolean stairCaseSearch(int matrix[][],int key){
        int row=matrix.length-1;
        int col=0;
        while(row>=0&&col<matrix.length){
            if(key==matrix[row][col]){
                 
                System.out.println("["+row+","+col+"]");
                return true;
            }
            else if(key>matrix[row][col]){
                 
                col++;
            }
            else
            row--;
        }
        
        return false;
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
    int matrix[][]={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
    int key=29;
    print2D(matrix);
    stairCaseSearch(matrix, key);
    }
}
