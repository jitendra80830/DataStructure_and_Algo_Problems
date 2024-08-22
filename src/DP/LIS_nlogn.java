package DP;


//Longest increasing subsequence in (nlogn)
public class LIS_nlogn {
    public static void main(String[] args) {
        int arr[] = {0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 11, 7, 15};
        System.out.println(LIS(arr));


    }
    public static int LIS(int arr[]){
        int dp[] = new int[arr.length];
        dp[0] = arr[0];
        int len = 1;
        for(int i =1;i<arr.length;i++){
            if(dp[len - 1] < arr[i]){ //if dp list me  small no hai arr ke value se the you can insert at last index
                dp[len] =arr[i];
                len++; // ans len is increment

            }else { // if dp ke list me small no nhi ho arr ke value se the search byb binary search tath index and insert
                int idx = BinarySearch(dp , 0 ,len -1 ,arr[i]);
                dp[idx] = arr[i]; // and dp ke list me arr[i] dall do
            }

        }
        for (int k=0;k<len;k++){
            System.out.print(dp[k]+" ");
        }
        System.out.println();
        return len;
    }

    private static int BinarySearch(int[] dp, int i, int j ,int item) {
        int si = i;
        int ei = j;
        int ans =0;
        while (si<=ei){
            int mid = (ei+si)/2;
            if(dp[mid] >item){
                ans =mid;
                ei = mid-1;

            }else {
                si = mid+1;
            }
        }
        return ans;

    }


}
