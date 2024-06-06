public class BubbleSort {
    public static void main(String[] args) {
        int arr[]={2,8,10,17,14,16};
        int res[]=bubbleSort(arr);
       for(int i:res){
        System.out.println(i);
    }
    // Worst and average Time complexity is o(n^2) where as best time complexity is 0(N)
}
    public static int[] bubbleSort(int[] arr){
        for(int i=arr.length-1;i>=0;i--){
            // If there are no swaps means alredy sorted so we can break
            int didSwap=0;
            for(int j=0;j<i;j++){
                // comparing with adjecent element if first element is greater than second swap;
                if(arr[j]>arr[j+1]){
                    // swapping
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    didSwap++;
                }
            }
            if(didSwap==0){
                break;
            }
        }
        return arr;
    }
}
