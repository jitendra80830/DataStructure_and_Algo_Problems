package RecursionPack;

public class AllOccurence {
    public static void main(String[] args){
        int arr[] = {2,3,5,6,5,4,5};
        int ans[] = allOccur(arr,5,0,0);
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }

    }
    public static int [] allOccur(int arr[],int item,int i,int count){

        if(i==arr.length){
            return new int[count];

        }
        if(arr[i]==item){
            count++;
            int res[] =allOccur(arr,item,i+1,count);
            res[count-1] =i;
            return res;
        }else{
            return allOccur(arr,item,i+1,count);
        }

    }
}
