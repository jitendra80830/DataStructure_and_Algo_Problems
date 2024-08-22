package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Find_K_Max_Min {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        findKthMInMax(arr , k);
    }

    private static void findKthMInMax(int[] arr, int k) {
        Arrays.sort(arr);;
        System.out.println(arr[k-1]);
    }
}
