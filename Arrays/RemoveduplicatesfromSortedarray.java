public class RemoveduplicatesfromSortedarray {
    public static void main(String[] args) {
        int arr[]={2,3,4,4,7,10,12,12,34};
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                arr[i+1]=arr[j];
                i++;
            }
        
        }
        for(int k=0;k<=i;k++){
            System.out.print(arr[k]+" ");
        }
    }
}
