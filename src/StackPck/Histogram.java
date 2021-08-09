package StackPck;

import java.util.Stack;

public class Histogram {
    public static void main(String[] args){
        int arr [] = {2,3,5,4,6,1,7};
        System.out.println(area(arr , 0 , arr.length-1));
        System.out.println(optimizeHistogram(arr ));

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
    public static int optimizeHistogram(int arr[] ){
        Stack<Integer> s = new Stack<>();
        int max_Area = 0;
        int i =0;
        while (i<arr.length){

            //1step
            if(s.isEmpty() || arr[i]> arr[s.peek()]){
                s.push(i);
                i++;
            }else {
                int r =i;
                int x = arr[s.pop()];
                int present_Area = 0;
                if(s.isEmpty()){
                    present_Area = x*r;
                }else {
                    int l = s.peek();
                    present_Area = x*(r-l-1);
                }
                max_Area = Math.max(max_Area , present_Area);
            }
        }
        while (!s.isEmpty()){
            int r =i;
            int x = arr[s.pop()];
            int present_Area = 0;
            if(s.isEmpty()){
                present_Area = x * r;
            }else {
                int l = s.peek();
                present_Area = x * (r-l-1);
            }
            max_Area = Math.max(max_Area , present_Area);

        }
        return max_Area;

    }
}
