package SlidingWindows;

public class MaxWin {
    public static void main(String[] args){
        int arr[] = {4,3,2,1,2,5};
        int k=10;
        System.out.println(productLessThen_K(arr,k));

    }
    public static int productLessThen_K(int [] arr, int k){
        int start = 0;
        int end = 0;
        int count =0;
        int p =1;
        while(end<arr.length){
            p*=arr[end];

            while(start<=end && p>=k){
                p/=arr[start];
                start++;

            }
            count += (end-start+1);
            end++;

        }
        return count;
    }
}
