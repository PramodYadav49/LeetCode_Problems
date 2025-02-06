public class FindMissingNumber {
    public static void main(String[] args) {
        int arr[]={1,2,4,5,6};
        int n=6;
        System.out.println(findWithXor(arr,n));
    }
    public static int findWithXor(int [] arr,int n){
        int xorSum=0;
        int xorArray=0;
        for(int i=1;i<=n;i++){
            xorSum^=i;
        }
        for(int item:arr){
            xorArray^=item;
        }
        return xorSum ^xorArray;
    }
}
