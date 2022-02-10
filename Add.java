public class Add {
    public static void fun(int[][] mat1,int[][] mat2){
        for(int i=0;i<mat1.length;i++){
            for(int j=0;j<mat2.length;j++){
                System.out.print(mat1[i][j]+mat2[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] mat1={{1,2,3},{4,5,6},{7,8,9}};
        int[][] mat2={{1,2,3},{4,5,6},{7,8,9}};
        fun(mat1,mat2);

    }
}
