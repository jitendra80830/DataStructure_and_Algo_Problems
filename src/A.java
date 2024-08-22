import java.util.Scanner;

public class A {
    //Problem
    //Solve
    //History
    //Ranking
    //
    //Minimum MSB
    //Problem Statement
    //
    //You are given an array A of length N. You need to find the minimum value of M such that you can form another array B of length N such that:
    //
    //0<=Bi<=2^M - 1, for all 1<=i<=N
    //A_1+B_1 <= A_2+B_2 <= …. <=A_n-1+B_n-1<=A_n+B_n
    //Input Format
    //
    //First line contains a single integer N, denoting the length of the array. Next line contains N space-separated integers denoting the array elements.
    //
    //Output Format Print the minimum value of M such that you can form an array B such that the above two conditions are satisfied.
    //
    //Constraints 1<=N<=10^5 -10^9<=A_i<=10^9
    //
    //Sample Input 4 1 7 6 5
    //
    //Sample Output 2
    //
    //Explanation of Sample
    //
    //Let B = [0,0,1,3]. Here all elements are <= 2^2 -1 which satisfies the first condition.
    //
    //Also 1+0<=7+0<=6+1<=5+3 which satisfies the second condition.
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();

        }
    }
}
