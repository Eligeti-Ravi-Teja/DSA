/**
 * MergeSort
 */
import java.util.*;
public class MergeSort {
    public static void mergeSort(int arr[],int low,int high){
        if(low>=high)return;
        int mid=(low+high)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr,mid+1,high);
        merge(arr, low, mid, high);
    }
    public static void merge(int arr[],int low, int mid, int high){
        ArrayList<Integer> temp=new ArrayList<>();
        int first=low;
        int second=mid+1;
        while(first<=mid && second<=high){
            if(arr[first]<=arr[second]){
                temp.add(arr[first]);
                first++;
            }
            else{
                temp.add(arr[second]);
                second++;
            }
        }
        while(first<=mid){
            temp.add(arr[first]);
            first++;
        }
        while(second<=high){
            temp.add(arr[second]);
            second++;
        }
        for(int i=low;i<=high;i++){
            arr[i]=temp.get(i-low);
        }
    }
    public static void main(String[] args) {
        int arr[]={2,9,5,16,8,14,32,10};
        mergeSort(arr, 0, arr.length-1);
        System.out.println("Sorted array: ");
        for(int i:arr){
            System.out.println(i);
        }
    }
    
}