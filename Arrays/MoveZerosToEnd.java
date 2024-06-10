public class MoveZerosToEnd {
    public static void main(String[] args) {
        int arr[]={2,0,14,32,0,0,34,2,1};
        int j=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        if(j==-1){
            for(int i:arr){
                System.out.println(i);
            }
        }
        else{
            for(int i=j+1;i<arr.length;i++){
                if(arr[i]!=0){
                    arr[j]=arr[i];
                    arr[i]=0;
                    j++;
                }
            }
        }
        for(int i:arr){
            System.out.println(i);
        }
    }
}
