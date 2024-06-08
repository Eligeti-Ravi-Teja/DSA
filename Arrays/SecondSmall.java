public class SecondSmall {
    public static void main(String[] args) {
        int arr[]={2,2,14,32,12,67,32,48};
        int small=Integer.MAX_VALUE;
        int secondSmall=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<small){
                secondSmall=small;
                small=arr[i];
            }
            if(arr[i]>small && arr[i]<secondSmall){
                secondSmall=arr[i];
            }
        }
        System.out.println(secondSmall);
    }
}
