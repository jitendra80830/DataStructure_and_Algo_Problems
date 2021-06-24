package Arary_2D;

public class Array_2d_Demo {
    public static void main(String[] args){
        int [] [] arr = new int[3][4];
        //System.out.println(arr);
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[1][2]);
        arr[0][2]=20;
        for(int i =0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();

        }
    }
}
