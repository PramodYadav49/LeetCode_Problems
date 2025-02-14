import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int arr[] ={0,1,0,3,12};
        int res[]=moveZerosToEnd(arr);
        System.out.println(Arrays.toString(res));
    }

    static int[] moveZerosToEnd(int arr[]) {
        int pt1 = 0;
        for (int pt2 = 0; pt2 < arr.length; pt2++) {
            if (arr[pt2] != 0) {
                // Swap only if necessary
                if (pt1 != pt2) {
                    int temp = arr[pt1];
                    arr[pt1] = arr[pt2];
                    arr[pt2] = temp;
                }
                pt1++;
            }
        }
        return arr;
    }
    // static int[] zerosMovesInTheEnd(int arr[]){
    //     int pt1=0;
    //     int pt2=1;
    //     for(in)
    //     return arr;
    // }
}
