package DP;

import java.util.Arrays;

public class House_Robber {
    public static void main(String[] args){
        int arr[] = {2,7,9,3,1};
        //System.out.println(house_robber(arr , 0));
        int dp[] = new int[arr.length];
        Arrays.fill(dp ,-1);
        System.out.println(house_robberTD(arr,0,dp));
        System.out.println(house_robberBU(arr));
        System.out.println(house_robber_SOP(arr));

    }
    public static int house_robber(int arr[] , int i){
        if(i>=arr.length){
            return 0;
        }
        int house2 = house_robber(arr , i+2);
        int house1 = house_robber(arr , i+1);
        int house0 = Math.max(arr[i] + house2   , house1);

        return house0;
    }
    public static int house_robberTD(int arr[] , int i ,int []dp){
        if(i>=arr.length){
            return 0;
        }
        if(dp[i]!=-1){ // if not -1 means there is values present in this case return dp
            return dp[i];
        }
        int house2 = house_robberTD(arr , i+2 ,dp);
        int house1 = house_robberTD(arr , i+1 ,dp);
        int house0 = Math.max(arr[i] + house2   , house1);
        dp[i] = house0; //store in array dp
        return house0;
    }
    public static int house_robberBU(int []arr){
        if(arr.length ==1){
            return arr[0];
        }
        int dp[] = new int[arr.length];
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0] ,arr[1]);

        for(int i =2;i<arr.length;i++){
            dp[i] = Math.max(arr[i] + dp[i-2] , dp[i-1]);

        }
        return dp[dp.length-1];
    }
    //space optimize
    public static int house_robber_SOP(int []arr){
        if(arr.length ==1){
            return arr[0];
        }
        int dp[] = new int[arr.length];
        int first = arr[0]; // store arr[0] in first
        int second = Math.max(arr[0] ,arr[1]); // max of arr[0] and arr[1] in second

        for(int i =2;i<arr.length;i++){ //loop from 2
            int third = Math.max(arr[i] + first ,  second);
            first = second;
            second = third;

        }
        return second;
    }
}
