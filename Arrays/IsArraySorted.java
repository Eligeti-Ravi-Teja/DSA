public class IsArraySorted {
    public static void main(String[] args) {
        int arr[]={2,12,23,32,48};
        System.out.println(isArraySorted(arr));
    }
    public static boolean isArraySorted(int arr[]){
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){return false;}
        }
        return true;

    } 
}
