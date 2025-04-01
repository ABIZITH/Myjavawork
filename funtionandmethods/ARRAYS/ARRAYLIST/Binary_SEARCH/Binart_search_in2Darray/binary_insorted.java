package ARRAYS.ARRAYLIST.Binary_SEARCH.Binart_search_in2Darray;

public class binary_insorted {
    public static void main(String[] args) {
        
    }

   // search in the row provided between the colums provided

   static int[] binrsearch(int[][]matrix , int row, int cstart,int cend,int target){

    while (cstart <= cend) {

        int mid = cstart + (cend - cstart) / 2;

        if(matrix[row][mid] == target){
            return new int[]{row,mid};
        }
        if(matrix[row][mid] < target){
            cstart = mid + 1;
        }else{
            cend = mid - 1;
        }
    }
    return new int[]{-1,-1};
    }
}
