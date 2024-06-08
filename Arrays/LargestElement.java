import java.util.*;
class LargestElement{
    public static void main(String[] args) {
        int arr[]={2,24,-3,17,28,32};
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Max number in array is: "+max);
        
    }
}