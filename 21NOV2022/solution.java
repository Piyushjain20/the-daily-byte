
class LonelyMatrixCount{
    public static void main(String[] args) {
       int matrix[][] = {{1,0},{0,1}};
       System.out.println(lonelyCount(matrix));
    }
    // Implementation one with extra space
    // public static int lonelyCount(int matrix[][]){
    //     int[] firstRow = new int[matrix[0].length];
    //     int[] firstCol = new int[matrix.length];
    //     int res=0;
    //     for(int i=0;i<matrix.length;i++){
    //         for(int j=0;j<matrix[0].length;j++){
    //             if(matrix[i][j]== 1 ){
    //                 firstRow[j]++;
    //                 firstCol[i]++;
    //             }
    //         }
    //     }
    //     for(int i=0;i<firstRow.length;i++){
    //         if(firstRow[i]==1){
    //             for(int j=0;j<firstCol.length;j++){
    //                 if(firstCol[j]==1) {
    //                     if(matrix[i][j]==1){
    //                         res++;
    //                     }
    //                 }
    //             }
    //         }
    //     }
    //    return res;
    // }

    public static int lonelyCount(int matrix[][]){
        int res=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]== 1 ){
                    if(i==0 || j==0){
                        res+=check(matrix,i,j);
                    }
                    else{
                        matrix[i][0]++;
                        matrix[0][j]++;
                    }   
                }
            }
        }
        for(int i=1;i<matrix.length;i++){
            if(matrix[i][0]==1){
                for(int j=1;j<matrix[0].length;j++){
                    if(matrix[0][j]==1){
                        if(matrix[i][j]==1){
                            res++;
                        }
                    }
                }
            }
        }
       return res;
    }

    private static int check(int[][] matrix, int i, int j) {
        for(int x=0;x<matrix.length;x++){
            if(matrix[x][j]==1 && x!=i) return 0;
        }
        for(int y=0;y<matrix[0].length;y++){
            if(matrix[i][y]==1 && y!=j) return 0;
        }
        return 1;
    }

}