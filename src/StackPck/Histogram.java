package StackPck;

public class Histogram {
    public static void main(String[] args){
        int arr [] = {2,3,5,4,6,1,7};
        System.out.println(area(arr , 0 , arr.length-1));

    }
    public static int area(int arr[] , int si , int ei){
        if(si>ei){
            return 0;
        }
        int min  = si;

        for(int i = si;i<ei;i++){
            if(arr[min] > arr[i]){
                min=i;
            }
        }
        int currentArea = arr[min]*(ei - si +1)*1; //no of bar

        int left_Area = area(arr , si , min - 1);
        int right_Area = area(arr , min+1 , ei);
        return Math.max(currentArea , Math.max(left_Area , right_Area));
    }
}
