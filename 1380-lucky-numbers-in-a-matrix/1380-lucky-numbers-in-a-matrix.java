class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
     List<Integer> al = new ArrayList<>();
    int m = matrix.length;
    int n = matrix[0].length;
    int rowmin= Integer.MAX_VALUE;
    int colmax= Integer.MIN_VALUE;
        int temp=0;
        
        for(int i=0; i<m; i++){
            rowmin= Integer.MAX_VALUE;
            for(int j =0; j<n; j++){
                if(matrix[i][j]<rowmin){
                    rowmin = matrix[i][j];
                    temp = j;
                }
            }
            
            colmax=rowmin;
            int c = temp;
            for(int r=0; r<m; r++ ){
                if(matrix[r][c]>colmax){
                    colmax=matrix[r][c];
                }
            }
            if(rowmin == colmax){
                al.add(0,rowmin);
            }
        }
        return al;
        
    }
}