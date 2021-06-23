package com.company;
import java.util.*;

import java.util.Scanner;

public class BookAllocation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int nob = sc.nextInt();
            int nos = sc.nextInt();
            int pages[] = new int[nob];
            for(int i=0;i<pages.length;i++){
                pages[i] = sc.nextInt();
            }
            System.out.println(bookAllocation(pages,nos));
        }
    }
    public static int bookAllocation(int book[],int nos){
        int low = 0;
        int high = 0;
        for(int i=0;i<book.length;i++){
            high+=book[i];
        }
        int ans = 0;
        while (low<=high){
            int mid = (low+high)/2;
            if(isitpossible(book,nos,mid)){
                high = mid-1;
                ans = mid;
            }else
                low = mid+1;
        }
        return ans;
    }

    public static boolean isitpossible(int[] book, int nos, int mid) {
        int student = 1;
        int no_of_pages = 0;
        int i = 0;
        while(i<book.length){
            if(no_of_pages+book[i]<=mid){
                no_of_pages+= book[i];
                i++;
            }else {
                no_of_pages = 0;
                student++;
            }
            if(student>nos){
                return false;
            }

        }
        return true;

    }
}
