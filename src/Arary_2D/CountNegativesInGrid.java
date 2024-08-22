package Arary_2D;

public class CountNegativesInGrid {
    public static void main(String[] args) {
        int grid[][] = {{4,3,2,-1},
                        {3,2,1,-1},
                        {1,1,-1,-2},
                        {-1,-1,-2,-3}};
        int ans = countNegatives(grid);
        System.out.println("total count = " + ans);
    }

    private static int countNegatives(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j <grid[i].length ; j++) {
                if(grid[i][j] <0){
                    count++;
                }
            }
        }
        return count;
    }
}
