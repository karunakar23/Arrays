import java.util.Arrays;

public class Merge {
    public static void fun(int[] arr1,int[] arr2){
        int i=0;
        int j=0;
        int[] arr=new int[arr1.length+arr2.length];
        int c=0;
        while(i<arr1.length&&j<arr2.length){
            if(arr1[i]<=arr2[j]){
                arr[c]=arr1[i];
                i++;
            }else{
                arr[c]=arr2[j];
                j++;
            }
            c++;
        }
        if(arr1.length==i){
            while(j<arr2.length){
                arr[c]=arr2[j];
                j++;
                c++;
            }
        }
        if(arr2.length==j){
            while(i<arr1.length){
                arr[c]=arr1[i];
                c++;
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr1={1,4,7,9,44,66,88,98};
        int[] arr2={1,3,6,8,23,56,76};
        fun(arr1,arr2);
    }
    
}
