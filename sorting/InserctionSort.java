public class InserctionSort {
    public static void main(String[] args) {
        int arr[]={2,5,4,10,8,27};
        int res[]=inserctionSort(arr);
        for(int i:res){
            System.out.println(i);
        }
        // Time complexity for worst and average o(n^2) and best o(N)
    }
    public static int[] inserctionSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int j=i;
            // taking the element and arranging it in its place
            while(j>0 && arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
            }
        }
        return arr;
    }
}
