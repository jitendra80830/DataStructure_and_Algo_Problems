package com.company;
import java.util.*;

public class AggressiveCow {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int nos = sc.nextInt();
        int noc = sc.nextInt();
        int stalls[] = new int[nos];
        for(int i=0;i<stalls.length;i++){
            stalls[i] = sc.nextInt();
        }
        Arrays.sort(stalls);
        System.out.println(aggressiveCow(stalls,noc));


    }
    public static int aggressiveCow(int stall[],int noc){

        int low = 0;
        int high = stall[stall.length-1]-stall[0];
        int ans = 0;
        while(low<=high){
            int mid = (low+high)/2;
            if(isitPossible(stall,noc,mid)){
                ans = mid;
                low = mid+1;
            }else
                high = mid-1;
        }
        return ans;

    }

    public static boolean isitPossible(int[] stall, int noc, int mid) {
        int cow =1;
        int placeholder = stall[0];
        int i = 1;
        while(i<stall.length){
            if(stall[i]-placeholder>=mid){
                cow++;
                placeholder = stall[i];
            }
            i++;
            if(cow>=noc){
                return true;
            }
        }
        return false;

    }
}
