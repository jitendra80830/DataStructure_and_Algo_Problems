public class BBB {
    //Problem
    //Solve
    //History
    //Ranking
    //
    //Minimum Time
    //Problem Statement You are given an array of A of size N and you can change the elements by performing an operation. You can perform a single operation once in a second. Let the initial time be t = 0. In a single operation, you can choose any subset in array A and add 2^t-1 to every element in the chosen subset. For example let the time be t = 4. You can add 2^3 to any number of elements in the array in that single operation. You need to find the minimum time in which we can make the whole array non-decreasing if we use our operations optimally.
    //
    //Constraints • 1 <=T<= 100 • 1 <=N<= 10^4 • 10^-9<= A[i]<= 10^9
    //
    //Input Format • First line contains a single integer T(number of test cases). • First line of each test case contains N . • Second line of each test case contains N spaced integers.
    //
    //Output Format For each test case print the answer in a new line.
    //
    //Sample Input 2 5 1 2 3 4 5 6 1 3 2 4 10 3
    //
    //Sample Output 0 3
    //
    //Explanation of Sample
    //
    //Test Case 1: Since the array is already in non decreasing order so we need 0 time to make it non decreasing
    //
    //Test Case 2: Initially when t = 0: (we can’t make any operations as no time has passed) A = [1 3 2 4 10 3] When t = 1: (Let’s add 1 to 3rd and the 6th element) A = [1 3 3 4 10 4] When t = 2: (Let’s add 2 to the 6th element) A = [1 3 3 4 10 6] When t = 3: (Let’s add 4 to the 6th element) A = [1 3 3 4 10 10] After t=3 our array A becomes non-decreasing. It can be proven that t=3 is the minimum time in which we can make our array non-decreasing. So the answer is 3.
}
