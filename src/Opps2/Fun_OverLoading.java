package Opps2;

public class Fun_OverLoading {
    public static void main(String[] args){
      //  System.out.println(sum(2,3));
       // System.out.println(sum(2,3 ,6));
       // System.out.println(sum(2,3,4.5));
        System.out.println(sum(2,3,3,4,4,5,6,7,7,7,8,6,5));

    }
    public static int sum(int a , int b){
        return a+b;
    }
    public static int sum(int a , int b , int c){
        return a+b+c;
    }
    public static int sum(int a , int b , double c){
        return (int) (a+b+c);
    }
    public static int sum(int ...b){ //no of variable
        int sum =0;
        for(int val : b){
            sum+=val;
        }
        return sum;

    }

}
