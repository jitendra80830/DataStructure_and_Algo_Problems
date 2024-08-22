package Arraylist;

import java.util.ArrayList;

public class Array_Two_Sum {
    public static void main(String[] args){
        int [] arr = {1,3,6};
        int [] arr1 = {9,5,7,6};
        System.out.println(TwoSum(arr,arr1));

    }
    public static ArrayList<Integer> TwoSum(int [] arr,int [] arr1){
        int i = arr.length -1;
        int j = arr1.length - 1;
        int carry=0;
        ArrayList<Integer> list = new ArrayList<>();
        while(i>=0 || j>=0){
            int sum = 0;

            if(i>=0){
                sum += arr[i];
                i--;
            }
            if(j>=0){
                sum += arr1[j];
                j--;
            }
            sum+=carry;
            carry = sum/10;
            list.add(0,sum%10);
        }
        if(carry!=0){
            list.add(0,carry);
        }
        return  list;

    }

}
