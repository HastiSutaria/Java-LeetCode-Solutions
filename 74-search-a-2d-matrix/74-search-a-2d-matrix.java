class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = matrix.length;
        int c =  matrix[0].length;
        
        if(matrix[0][0]>target || matrix[r-1][c-1]<target)
            return false;
        
        int i = r-1;
        int j=0;
        while(i>=0 && j<c){
        int num=matrix[i][j];
        if(num>target)
            i--;
        else if(num<target)
            j++;
            
        else if(num==target)
            return true;
        
        }
        return false;
    }
}