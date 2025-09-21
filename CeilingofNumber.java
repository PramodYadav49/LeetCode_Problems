public class CeilingofNumber {
    
    public static void main(String[] args) {
        int arr[]={2,3,5,9,14,16,18};
        System.out.println(ceilingofNumber(arr, 19));
    }
   
    static int ceilingofNumber(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
         int get=0;
        while(start <=end){
            int mid=start+(end-start)/2;
            if(arr[mid] == target){
                return arr[mid];
            }
            else if(arr[mid]< target){
                start=mid+1;
            }else{
                end=mid-1;
            }
            get=mid;
        }
        return start;
    }

}
