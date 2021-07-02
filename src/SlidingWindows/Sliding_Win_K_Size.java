package SlidingWindows;

public class Sliding_Win_K_Size {
    public static void main(String[] args){
        int arr[] = {1,5,7,9,2,11,4,3};
        int k = 3;
        System.out.println(max_sum_sliding_Win_K(arr,k));

    }
    public static int max_sum_sliding_Win_K(int [] arr , int k){
        int sum =0;
        int max_sum = 0;
        for(int i =0;i<k;i++){
            sum+=arr[i];

        }
        max_sum = sum;
        for(int i=k;i<arr.length;i++){
            sum+=arr[i]; //next element adding
            sum-=arr[i-k]; //removing last element
            max_sum = Math.max(max_sum,sum);
        }
        return max_sum;

    }
}
