
public class LeftRotateAnArrayByOnePlace {
    public static void main(String[] args) {
        int arr[]={4,21,43,6,23,72};
        int temp=arr[0];
        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=temp;
        for(int i:arr){
            System.out.println(i);
        }
    }
    
}