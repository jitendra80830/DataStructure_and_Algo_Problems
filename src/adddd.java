public class adddd {
    public static void main(String[] args){
            int arr[]={1,1,2,3,3,3};
            int n=arr.length;
            int sum=0;
            int i;
            for ( i = 0; i < n; i++)
            {

                for (int j = 0; j <n; j++)
                {
                    if (arr[i]==arr[j])
                    {

                        sum=sum+arr[i];

                    }

                }

            }
            System.out.println(sum);
    }
}
