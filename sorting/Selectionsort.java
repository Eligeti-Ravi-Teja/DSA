class Selectionsort {
public static void main(String[] args) {
    int arr[]={2,5,4,10,8,27};
    int res[]=selectionSort(arr);
    for(int i:res){
        System.out.println(i);
    }
    // Time complexitiy for selection sort alogrithm is o(n^2)
}   
public static int[] selectionSort(int arr[]){
    int min=0;
    for(int i=0;i<arr.length;i++){
        min=i;
        // finding the minimum index
        for(int j=i;j<arr.length;j++){
            if(arr[j]<arr[min])
                min=j;
        }
        // swapping i with min 
        if(min!=i){
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
    }
    return arr;
}
}