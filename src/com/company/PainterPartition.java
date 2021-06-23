package com.company;

import java.util.Scanner;
import java.util.*;

public class PainterPartition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int nob = sc.nextInt();
            int nop = sc.nextInt();
            int lengths[] = new int[nob];
            for (int i = 0; i < lengths.length; i++) {
                lengths[i] = sc.nextInt();
            }
            System.out.println(paintPartition(lengths, nop));
        }
    }

    public static int paintPartition(int board[], int nop) {
        int low = 0;
        int high = 0;
        for (int i = 0; i < board.length; i++) {
            high += board[i];
        }
        int ans = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (isitPossible(board, nop, mid)) {
                high = mid - 1;
                ans = mid;
            }
            low = mid + 1;
        }
        return ans;
    }

    public static boolean isitPossible(int[] board, int nop, int mid) {
        int painter = 1;
        int length_of_board = 0;
        int i = 0;
        while (i<board.length){
            if (length_of_board + board[i] <= mid) {
                length_of_board += board[i];
                i++;
            } else {
                length_of_board = 0;
                painter++;
            }
            if (painter > nop) {
                return false;
            }
        }
        return true;
    }
}
