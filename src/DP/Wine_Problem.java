package DP;

public class Wine_Problem {
    public static void main(String[] args){
        int [] cost = {2,3,5,1,4};
        System.out.println(wineProblem(cost , 1 ,0 , cost.length-1));
        int dp[][] = new int[cost.length][cost.length];
        System.out.println(wineProblemTD(cost , 1 , 0 ,cost.length-1 ,dp));
        System.out.println(wineProblemBU(cost));

    }
    public static int wineProblem(int cost[] ,int year ,int i ,int j){ // i for 1st index and j means last index
        if(i>j){
            return 0;
        }


        int fs = cost[i]*year + wineProblem(cost ,year+1 , i+1 ,j); // for 1st wine sales
        int ls = cost[j] *year + wineProblem(cost ,year+1 , i ,j-1); // for last wine sales

        return Math.max(fs , ls);
    }
    public static int wineProblemTD(int cost[] ,int year ,int i ,int j ,int dp[][]){ // i for 1st index and j means last index
        if(i>j){
            return 0;
        }

        if(dp[i][j]!=0){
            return dp[i][j];
        }

        int fs = cost[i]*year + wineProblemTD(cost ,year+1 , i+1 ,j ,dp); // for 1st wine sales
        int ls = cost[j] *year + wineProblemTD(cost ,year+1 , i ,j-1 ,dp); // for last wine sales

        return dp[i][j] = Math.max(fs , ls); // store in dp
    }
    public static int wineProblemBU(int [] cost){
        int dp[][] = new int[cost.length][cost.length];

        //for diogonal filling (means left fill) like 0,0=1,1=2,2=3,3=4,4
        for(int k =0;k<dp.length;k++){
            dp[k][k] = cost.length*cost[k];
        }

        int year = cost.length-1; //from 4
        for(int slid =1;slid<dp.length;slid++){ // for col
            for(int j =slid;j<dp.length;j++){ // for no of row
                int i =j-slid; //for indexing 0 to 4
                int fs = cost[i]*year + dp[i+1][j]; // from i to j
                int ls = cost[j]*year + dp[i][j-1]; // j-1 to i
                dp[i][j] = Math.max(fs ,ls);
            }
            year--;
        }
        return dp[0][cost.length-1];

    }
}
