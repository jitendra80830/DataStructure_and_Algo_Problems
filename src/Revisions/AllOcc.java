package Revisions;

public class AllOcc {
    public static void main(String[] args){
        int arr[] = {2,3,5,6,7,5,3,7,5,8};
        int [] ans = allOcc(arr , 5 , 0,0);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }

    }
    public static int[] allOcc(int arr[],int item ,int i,int count){
        if(i==arr.length){
            return new int[count];
        }

        if(arr[i]==item){
            count++;
            int res[] = allOcc(arr , item ,i+1,count);
            res[count-1] = i;
            return  res;

        }else {
           return allOcc(arr,item,i+1,count);

        }
    }
}
