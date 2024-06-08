import java.util.*;

public class QuickSort {
    public static void main(String[] args) {
    	int list[]= {5,10,7,12,11,3,6,1};
        quickSort(list, 0, list.length-1);
        for(int i:list) {
        	System.out.println(i);
        }
    }
	public static void quickSort(int[] arr,int low,int high){
        if(low<high){
            int pivot=pivotEle(arr, low, high);
            quickSort(arr, low, pivot-1);
            quickSort(arr,pivot+1,high);
        }
    }
    public static int pivotEle(int[] arr,int low,int high){
        int pivot=arr[low];
        int i=low;
        int j=high;
        while(i<j){
            while(arr[i]<=pivot && i<high){
                i++;
            }
            while (arr[j]>pivot && j>low) {
                j--;
            }
            if(j>i){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]= temp;
            }
        }
        int temp=pivot;
        arr[low]= arr[j];
        arr[j]= temp;
        return j;
    }


}

