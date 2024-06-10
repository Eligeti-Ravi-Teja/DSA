/**
 * LeftRotateAnArrayByDElements
 */
public class LeftRotateAnArrayByDElements {
public static void main(String[] args) {
    int arr[]={20,11,2,32,15,8,12};
    int d=6;
    // bruteForce(arr, d);
    optimalSolution(arr, d);
}
public static void bruteForce(int arr[],int d){
    // as for every arr.length it will come to same postition
    d=d%arr.length;
    // storing 0 to d-1 elements in an array 
    int temp[]=new int[d];
    for(int i=0;i<d;i++){
        temp[i]=arr[i];

    }
    // shifting reamining elements to its place 
    for(int i=d;i<arr.length;i++){
        arr[i-d]=arr[i];
    }
    int j=0;
    // adding rotating elements to array
    for(int i=arr.length-d;i<arr.length;i++){
        arr[i]=temp[j];
        j++;
    }
    for(int i:arr){
        System.out.println(i);
    }
}
public static void optimalSolution(int arr[],int d){
    reverseArray(arr, 0, d-1);
    reverseArray(arr, d, arr.length-1);
    reverseArray(arr, 0, arr.length-1);
    for(int i:arr){
        System.out.println(i);
    }
}
public static void reverseArray(int arr[],int start,int end){
    while(start<end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
    }
}
    
}