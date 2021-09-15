package HashMap_Pack;

import java.util.ArrayList;
import java.util.HashMap;

public class IntersectionTwoArray {
    public static void main(String[] args){
        int arr1[]  = {3,5,7,5,2,6,1,7};

        int arr2[] = {2,7,3,5,9,18,6,7};
        intersectionTwoArrays(arr2 , arr1);
    }
    public static void intersectionTwoArrays(int arr2[] , int arr1[]){
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i =0;i<arr1.length;i++){
            if(map.containsKey(arr2[i])){
                map.put(arr2[i] , map.get(arr2[i])+1);  //if that value present in map then increase that  frequency +1


            }else {
                map.put(arr2[i] , 1); // if that key not in map then put in map with 1 frequency
            }

        }
        //int arr2[] = {2,7,3,5,9,18,6,7};
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i =0;i<arr1.length;i++){
            if(map.containsKey(arr2[i]) && map.get(arr2[i])!=0){
                ans.add(arr2[i]);
               map.put(arr2[i] , map.get(arr2[i] -1));

            }
        }
        System.out.println(ans);
    }
}
