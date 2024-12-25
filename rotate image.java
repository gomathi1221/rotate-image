class Solution {
    public void rotate(int[][] matrix) {
        int i=0;
        int j=0;
        while(i<matrix.length){
            j=0;
            while(j<i){
                int t=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=t;
             j++;
            }
            i++;
        }
        for(i=0;i<matrix.length;i++){
            int s=0;
            int e=matrix.length-1;
            while(s<e){
              int t=matrix[i][s];
              matrix[i][s]=matrix[i][e];
              matrix[i][e]=t;
              s++;
              e--;
            }
        }
    }
}