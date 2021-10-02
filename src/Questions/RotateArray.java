package Questions;

public class RotateArray {
    public static void main(String[] args){
        int arr [] = {1,2,3,4,5,6,7};
        //rotate(arr,2);
        //reverse(arr);
        rotate_Algo(arr,40);
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void rotate(int arr[] ,int k){

        for(int i=1;i<=k;i++){
            int a = arr[arr.length-1];
            for (int j= arr.length-2;j>=0;j--){
                arr[j+1]=arr[j];
            }
            arr[0]=a;
        }
    }
    public static void reverse(int arr[],int i , int j){
        //int i = 0;
        //int j = arr.length-1;
        while (i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public static void rotate_Algo(int arr[] ,int k){
        k = k%arr.length;
        reverse(arr,arr.length-k,arr.length-1);
        reverse(arr,0,arr.length-k-1);
        reverse(arr,0,arr.length-1);
    }
}
