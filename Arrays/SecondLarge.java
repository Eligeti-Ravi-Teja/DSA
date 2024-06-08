public class SecondLarge {
    public static void main(String[] args) {
        int arr[]={2,2,14,32,12,67,32,48,48};
        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                secondMax=max;
                max=arr[i];
            }
            if(arr[i]<max && arr[i]>secondMax){
                secondMax=arr[i];
            }
        }
        System.out.println(secondMax);
    }
}
