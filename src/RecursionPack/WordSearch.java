package RecursionPack;

public class WordSearch {
    public static void main(String[] args) {
        char[][] grid = {{'A', 'B', 'C', 'E' }, {'S', 'F', 'C', 'S' }, {'A', 'D', 'E', 'E' }};
        String word = "ABCCED";
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                boolean ans = wordSearch(grid, word, i, j, 0);
                if (ans) {
                    System.out.println(ans);
                    return;

                }
            }
        }
        System.out.println(false);

    }

    public static boolean wordSearch(char[][] grid, String word, int r, int c, int i) {
        if (i == word.length()) {
            return true;
        }


        if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length || grid[r][c] != word.charAt(i)) {
            return false;
        }
        int[] row = {0, 0, -1, 1,-1,-1,1,1};
        int[] col = {1, -1, 0, 0,1,-1,-1,1};

        boolean ans = false;
        grid[r][c] = '*';

        for (int j = 0; j < col.length; j++) {
            ans = wordSearch(grid, word, r + row[j], c + col[j], i + 1);
            if (ans) {
                return ans;
            }
        }
        grid[r][c]=word.charAt(i);
        return ans;
    }
}
