package Arrays;

public class CountKDifferences {
    public static void main(String[] args) {
        int arr[] = {3,2,1,5,4};
        int k =2;
        int ans =  countKDifference(arr , k);
        System.out.println(ans);
    }

    private static int countKDifference(int[] arr, int k) {

        int count = 0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if(Math.abs(arr[i] - arr[j]) == k){
                    count++;

                }

            }

        }
        return count;

    }
}
