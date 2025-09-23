import java.util.*;

public class Main {

    public static int ValidTriangles(int n, int[] arr) {
        Arrays.sort(arr); // Step 1: sort the array
        int count = 0;

        // Step 2: Fix the largest side (arr[k])
        for (int k = n - 1; k >= 2; k--) {
            int i = 0;
            int j = k - 1;

            // Step 3: Two-pointer approach
            while (i < j) {
                if (arr[i] + arr[j] > arr[k]) {
                    // all elements from i...j-1 with arr[j] and arr[k] are valid
                    count += (j - i);
                    j--;
                } else {
                    i++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }
        int ans = ValidTriangles(n, arr);
        System.out.println(ans);
    }
}
