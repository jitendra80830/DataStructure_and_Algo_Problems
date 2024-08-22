package Devide_and_Conquer;

public class MergeSort {
    public static void main(String[] args){
        int arr [] = {5,6,1,8,2,7};
        int si = 0;
        int end = arr.length-1;
        int [] ans = mergeSort(arr,si,end);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }

    }
    public static int [] mergeSort(int [] arr,int si ,int end){
        if(si==end){
            int bs[] = new int[1];
            bs[0]=arr[si];
            return bs;
        }
        int mid = (si+end)/2;
        int [] fs = mergeSort(arr,si,mid);
        int [] ss = mergeSort(arr,mid+1,end);
        return mergeTwoArray(fs , ss);

    }
    public static  int [] mergeTwoArray(int [] arr1,int [] arr2){
        int i=0;
        int j=0;
        int [] c = new int[arr1.length+arr2.length];
        int k=0;
        while (i <arr1.length && j <arr2.length){
            if(arr1[i]<arr2[j]){
                c[k]=arr1[i];
                i++;
                k++;
            }else {
                c[k]=arr2[j];
                j++;
                k++;

            }
        }
        while (i<arr1.length){
            c[k]=arr1[i];
            i++;
            k++;
        }
        while (j<arr2.length){
            c[k]=arr2[j];
            j++;
            k++;
        }
        return c;

    }
}
