package Arary_2D;

public class Spiral {
    public static void main(String[] args){
        int arr[][] = {{11,12,13,14,66},{15,16,17,18,77},{19,20,21,22,88},{23,24,25,26,99}};
        spiral(arr);

    }
    public static void spiral(int arr[][]){
        int min_row = 0;
        int min_col = 0;
        int max_row = arr.length-1;
        int max_col = arr[0].length-1;
        int total_elements = arr.length*arr[0].length;
        int count=0;
        while(count<total_elements) {
            for (int col = min_col; col < max_col; col++) {
                System.out.println(arr[min_col][col]+" ");
                count++;
            }
            min_row++;
            for (int row = min_row; row <= max_row; row++) {
                System.out.println(arr[row][max_col]+" ");
                count++;
            }
            max_col--;
            for (int col = max_col; col >= min_col; col--) {
                System.out.println(arr[max_row][col]+" ");
                count++;
            }
            max_row--;
            for (int row = max_row; row >= min_row; row--) {
                System.out.println(arr[row][min_col]+" ");
                count++;
            }
            min_col++;
        }
    }
}
