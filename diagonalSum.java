class Solution {
    public int diagonalSum(int[][] mat) {
        int primary = 0; 
        int ans = 0; 
        int secondary = 0; 
        int i=0,j=0;
    while(i<mat.length && j<mat.length){
        primary+=mat[i][j];
        i++;
        j++;
    }
    i=0 ; j=mat.length-1;
    while(i<mat.length && j>-1){
        secondary +=mat[i][j];
        i++;
        j--;
    }
    if((mat.length-1)%2==0){
        ans = primary + secondary - mat[(mat.length-1)/2][(mat.length-1)/2];
    }else{
        ans = primary + secondary;
    }
    return ans;
    }
}
