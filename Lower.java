public class Lower {
    public static void main(String[] args) {
        int[][] mat={{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4}};
        for(int i=1;i<mat.length;i++){
            for(int j=0;j<i;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
