public class LargeSmall {
    public static void main(String[] args) {
        int[] arr={1,2,3,7,8,54,2,1,4,5,6,7,4,3,2,2,442};
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("max is :"+max);
        System.out.println("min is :"+min);
    }
}
