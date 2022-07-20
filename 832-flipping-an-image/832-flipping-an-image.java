class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
       int n=image.length;
int m=image[0].length;

    for(int i=0;i<n;i++)
    {
	//swapping
        int low=0,high=m-1;
        while(low<high){
            int temp=image[i][low];
            image[i][low]=image[i][high];
            image[i][high]=temp;
            low++;
            high--;
        }
    }
    
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(image[i][j]==1){
                image[i][j]=0;
            }
            else{
                image[i][j]=1;
            }
        }
    }
    return image;
    }
}