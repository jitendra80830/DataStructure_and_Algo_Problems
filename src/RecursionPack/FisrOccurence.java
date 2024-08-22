package RecursionPack;

public class FisrOccurence {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 7, 2, 3, 4, 7, 3};
        //System.out.println(firstOcc(arr,4,0));
        System.out.println(lastOcc(arr,4,arr.length-1));

    }
    public static int firstOcc(int arr[],int item ,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i] ==item){
            return i;
        }
        return firstOcc(arr,item,i+1);
    }
    public static int lastOcc(int arr[],int item,int i ){
        if(i ==0){
            return -1;
        }
        if(arr[i]==item){
            return i;
        }
        return lastOcc(arr,item,i-1);
    }

}