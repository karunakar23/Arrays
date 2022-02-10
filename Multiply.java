public class Multiply {
    public static void fun(int[][] mat1,int[][] mat2){
        for(int i=0;i<mat1.length;i++){
            for(int j=0;j<mat1.length;j++){
                int res=0;
                for(int k=0;k<mat1.length;k++){
                    res+=mat1[i][k]*mat2[k][j];
                }
                System.out.print(res+"\t");
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
